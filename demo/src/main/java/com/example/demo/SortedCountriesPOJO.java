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
public class SortedCountriesPOJO {

    private String name;
    private BigDecimal area;
    private String country_code2;

    public SortedCountriesPOJO(String name, BigDecimal area, String country_code2) {
        this.name = name;
        this.area = area;
        this.country_code2 = country_code2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }

}
