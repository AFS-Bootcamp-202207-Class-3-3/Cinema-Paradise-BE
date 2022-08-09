package com.thoughtworks.training.model.dto;

public class OrderResponse {

    private String id;
    private String user;
    private String movie_title;
    private double price;
    private String cinema_name;
    private String room;
    private String date;
    private String time;
    private String seat;
    private Boolean paid;

    public OrderResponse() {
    }

    public OrderResponse(String id, String user, String movie_title, double price, String cinema_name, String room, String date, String time, String seat, Boolean paid) {
        this.id = id;
        this.user = user;
        this.movie_title = movie_title;
        this.price = price;
        this.cinema_name = cinema_name;
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

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
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
