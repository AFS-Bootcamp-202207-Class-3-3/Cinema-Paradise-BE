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
    @ManyToOne
    @JoinColumn(name = "arrangement_id")
    private Arrangement arrangement;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "order_time")
    private Time orderTime;
    private String seat;
    private Boolean paid;

    public Order() {
    }

    public Order(String userId, Movie movie, double price, Cinema cinema, String room, Arrangement arrangement, Date orderDate, Time orderTime, String seat, Boolean paid) {
        this.userId = userId;
        this.movie = movie;
        this.price = price;
        this.cinema = cinema;
        this.room = room;
        this.arrangement = arrangement;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.seat = seat;
        this.paid = paid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Arrangement getArrangement() {
        return arrangement;
    }

    public void setArrangement(Arrangement arrangement) {
        this.arrangement = arrangement;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Time getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Time orderTime) {
        this.orderTime = orderTime;
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
