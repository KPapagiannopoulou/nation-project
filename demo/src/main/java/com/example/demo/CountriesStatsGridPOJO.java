/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class CountriesStatsGridPOJO {

    private String name;
    private String country_code3;
    private int year;
    private int population;
    private BigDecimal gdp;

    public CountriesStatsGridPOJO(String name, String country_code3, int year, int population, BigDecimal gdp) {
        this.name = name;
        this.country_code3 = country_code3;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }

}
