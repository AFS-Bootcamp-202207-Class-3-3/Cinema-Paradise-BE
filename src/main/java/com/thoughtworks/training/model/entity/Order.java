package com.thoughtworks.training.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "movie_orders")
public class Order {
    @Id
    private String id;
    private String user_id;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private double price;
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;
    private String room;
    private Date order_date;
    private Time order_time;
    private String seat;
    private Boolean paid;

    public Order() {
    }

    public Order(String user, Movie movie, double price, Cinema cinema, String room, Date date, Time time, String seat, Boolean paid) {
        this.user_id = user;
        this.movie = movie;
        this.price = price;
        this.cinema = cinema;
        this.room = room;
        this.order_date = date;
        this.order_time = time;
        this.seat = seat;
        this.paid = paid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user_id;
    }

    public void setUser(String user) {
        this.user_id = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getDate() {
        return order_date;
    }

    public void setDate(Date date) {
        this.order_date = date;
    }

    public Time getTime() {
        return order_time;
    }

    public void setTime(Time time) {
        this.order_time = time;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}
