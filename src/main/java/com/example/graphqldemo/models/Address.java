package com.example.graphqldemo.models;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "landmark")
    private String landmark;

    public Address() {

    }

    public Address(Long id) {
        this.id = id;
    }

    public Address(String region, String landmark) {
        this.region = region;
        this.landmark = landmark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", region=" + region + ", landmark=" + landmark + "]";
    }

}

