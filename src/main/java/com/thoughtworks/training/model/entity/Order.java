package com.thoughtworks.training.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "movie_orders")
public class Order {
    @Id
    private String id;
    @Column(name = "user_id")
    private String userId;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private double price;
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;
    private String room;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "order_time")
    private Time orderTime;
    private String seat;
    private Boolean paid;

    public Order() {
    }

    public Order(String user, Movie movie, double price, Cinema cinema, String room, Date date, Time time, String seat, Boolean paid) {
        this.userId = user;
        this.movie = movie;
        this.price = price;
        this.cinema = cinema;
        this.room = room;
        this.orderDate = date;
        this.orderTime = time;
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
        return userId;
    }

    public void setUser(String user) {
        this.userId = user;
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
        return orderDate;
    }

    public void setDate(Date date) {
        this.orderDate = date;
    }

    public Time getTime() {
        return orderTime;
    }

    public void setTime(Time time) {
        this.orderTime = time;
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
