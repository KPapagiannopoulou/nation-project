/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.entities.Countries;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/api/v1")
public class CountriesController {

    private static final Logger LOG = Logger.getLogger(CountriesController.class.getName());

    @Autowired
    private CountriesRespository countriesRepository;

    @GetMapping("/countries")
    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }

    @GetMapping("/countries-info-sorted")
    public ResponseEntity getCountriesInfoSorted() {
        LOG.log(Level.INFO, "------ in get countries sorted ------ ");
        List<SortedCountriesPOJO> sorted = countriesRepository.getCountriesSorted();
        return ResponseEntity.ok().body(sorted);
    }

    @GetMapping("/countries-stats-grid")
    public ResponseEntity getCountriesStatsGrid() {
        LOG.log(Level.INFO, "------ in get countries stats ------ ");
        List<CountriesStatsGridPOJO> stats = countriesRepository.getCountriesStatsGrid();
        return ResponseEntity.ok().body(stats);
    }

    @GetMapping("/summary-grid")
    public ResponseEntity getSummaryGrid() {
        LOG.log(Level.INFO, "------ in get summary grid ------ ");
        List<SummaryGridPOJO> stats = countriesRepository.getSummaryGrid();
        return ResponseEntity.ok().body(stats);
    }
}
