package com.thoughtworks.training.model.dto.request;

public class CinemaRequest {
    private String name;
    private String location;

    public CinemaRequest() {
    }

    public CinemaRequest(String name, String location) {
        this.name = name;
        this.location = location;
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
