package com.thoughtworks.training.model.entity;

import javax.persistence.*;

@Entity
public class Order {
    @Id
    private String id;
    private String user;
    @Transient
    private Movie movie_id;
    private double price;

    public Movie getMovie_id() {
        return movie_id;
    }

}
