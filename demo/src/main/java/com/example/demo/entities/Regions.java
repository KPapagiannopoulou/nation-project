/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "regions")
public class Regions implements Serializable {

    @Id
    @Column(name = "region_id", nullable = false)
    private int region_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "continent_id", nullable = false)
    private int continent_id;

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContinent_id() {
        return continent_id;
    }

    public void setContinent_id(int continent_id) {
        this.continent_id = continent_id;
    }

}
