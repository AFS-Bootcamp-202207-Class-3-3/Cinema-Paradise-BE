package com.thoughtworks.training.model.dto.request;

public class ArrangementRequest {
    private String room;
    private String arrangeDate;
    private String time;
    private String movieId;
    private String cinemaId;
    private double price;

    public ArrangementRequest() {
    }

    public ArrangementRequest(String room, String arrangeDate, String time, String movieId, String cinemaId, double price) {
        this.room = room;
        this.arrangeDate = arrangeDate;
        this.time = time;
        this.movieId = movieId;
        this.cinemaId = cinemaId;
        this.price = price;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getArrangeDate() {
        return arrangeDate;
    }

    public void setArrangeDate(String arrangeDate) {
        this.arrangeDate = arrangeDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
