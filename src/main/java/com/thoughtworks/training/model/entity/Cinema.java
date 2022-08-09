package com.thoughtworks.training.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cinema {
    @Id
    private String id;
    private String name;
    private String location;

    public Cinema() {
    }

    public Cinema(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
