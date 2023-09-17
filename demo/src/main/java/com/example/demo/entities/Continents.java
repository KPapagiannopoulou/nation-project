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
@Table(name = "continents")
public class Continents implements Serializable {

    @Id
    @Column(name = "continent_id", nullable = false)
    private int continent_id;
    @Column(name = "name", nullable = false)
    private String name;

    public int getContinent_id() {
        return continent_id;
    }

    public void setContinent_id(int continent_id) {
        this.continent_id = continent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
