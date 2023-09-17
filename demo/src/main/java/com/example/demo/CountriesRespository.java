/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.entities.Countries;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface CountriesRespository extends JpaRepository<Countries, Integer> {

    @Query(myQueryForSortedCountries)
    List<SortedCountriesPOJO> getCountriesSorted();

    @Query(myQueryForStats)
    List<CountriesStatsGridPOJO> getCountriesStatsGrid();

    @Query(myQueryForSummary)
    List<SummaryGridPOJO> getSummaryGrid();

    String myQueryForSortedCountries = "SELECT NEW com.example.demo.SortedCountriesPOJO(c.name, c.area, c.country_code2) FROM Countries c ORDER BY name ASC";

    String myQueryForStats = "SELECT NEW com.example.demo.CountriesStatsGridPOJO("
            + "c.name, "
            + "c.country_code3, "
            + "cs.year, "
            + "cs.population, "
            + "cs.gdp ) "
            + "FROM "
            + "Countries c "
            + "JOIN "
            + "Country_stats cs ON c.country_id = cs.country_id "
            + "LEFT JOIN "
            + "Country_stats cs2 ON c.country_id = cs2.country_id "
            + "AND cs.gdp / cs.population < cs2.gdp / cs2.population "
            + "WHERE "
            + "cs2.country_id IS NULL "
            + "ORDER BY "
            + "c.country_code3, cs.year";

    String myQueryForSummary = "SELECT NEW com.example.demo.SummaryGridPOJO("
            + "    co.name AS continent_name, "
            + "    r.name AS region_name, "
            + "    c.name AS country_name, "
            + "    cs.year, "
            + "    cs.population, "
            + "    cs.gdp ) "
            + "FROM "
            + "    Continents co "
            + "JOIN "
            + "    Regions r ON co.continent_id = r.continent_id "
            + "JOIN "
            + "    Countries c ON r.region_id = c.region_id "
            + "JOIN "
            + "    Country_stats cs ON c.country_id = cs.country_id "
            + "ORDER BY "
            + "    co.name, r.name, c.name, cs.year";

}
