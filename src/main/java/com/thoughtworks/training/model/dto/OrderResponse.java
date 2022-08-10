package com.thoughtworks.training.model.dto;

public class OrderResponse {

    private String id;
    private String user;
    private String movieTitle;
    private double price;
    private String cinemaName;
    private String room;
    private String date;
    private String time;
    private String seat;
    private Boolean paid;

    public OrderResponse() {
    }

    public OrderResponse(String id, String user, String movieTitle, double price, String cinemaName, String room, String date, String time, String seat, Boolean paid) {
        this.id = id;
        this.user = user;
        this.movieTitle = movieTitle;
        this.price = price;
        this.cinemaName = cinemaName;
        this.room = room;
        this.date = date;
        this.time = time;
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
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
