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
public class SummaryGridPOJO {

    private String continent;
    private String region;
    private String country;
    private int year;
    private int population;
    private BigDecimal gdp;

    public SummaryGridPOJO(String continent, String region, String country, int year, int population, BigDecimal gdp) {
        this.continent = continent;
        this.region = region;
        this.country = country;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
