package com.thoughtworks.training.model.dto;

public class OrderRequest {

    private String user;
    private String movieId;
    private double price;
    private String cinemaId;
    private String room;
    private String date;
    private String time;
    private String seat;
    private Boolean paid;

    public OrderRequest() {
    }

    public OrderRequest(String user, String movieId, double price, String cinemaId, String room, String date, String time, String seat, Boolean paid) {
        this.user = user;
        this.movieId = movieId;
        this.price = price;
        this.cinemaId = cinemaId;
        this.room = room;
        this.date = date;
        this.time = time;
        this.seat = seat;
        this.paid = paid;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
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
