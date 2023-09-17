/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
@Table(name = "countries")
public class Countries implements Serializable {

    @Id
    @Column(name = "country_id")
    private int country_id;
    @Column(name = "name")
    private String name;
    @Column(name = "area", nullable = false)
    private BigDecimal area;
    @Column(name = "national_day")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date national_day;
    @Column(name = "country_code2", nullable = false)
    private String country_code2;
    @Column(name = "country_code3", nullable = false)
    private String country_code3;
    @Column(name = "region_id", nullable = false)
    private int region_id;

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
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

    public Date getNational_day() {
        return national_day;
    }

    public void setNational_day(Date national_day) {
        this.national_day = national_day;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

}
