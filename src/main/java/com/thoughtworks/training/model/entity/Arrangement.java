package com.thoughtworks.training.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Arrangement {
    @Id
    private String id;
    private String room;
    @Column(name = "arrange_date")
    private Date arrangeDate;
    private Time time;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movieArrange;
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinemaArrange;
    private double price;

    public Arrangement() {
    }

    public Arrangement(String room, Date arrangeDate, Time time, Movie movieArrange, Cinema cinemaArrange, double price) {
        this.room = room;
        this.arrangeDate = arrangeDate;
        this.time = time;
        this.movieArrange = movieArrange;
        this.cinemaArrange = cinemaArrange;
        this.price = price;
    }

    public Date getArrangeDate() {
        return arrangeDate;
    }

    public void setArrangeDate(Date arrangeDate) {
        this.arrangeDate = arrangeDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Movie getMovieArrange() {
        return movieArrange;
    }

    public void setMovieArrange(Movie movieArrange) {
        this.movieArrange = movieArrange;
    }

    public Cinema getCinemaArrange() {
        return cinemaArrange;
    }

    public void setCinemaArrange(Cinema cinemaArrange) {
        this.cinemaArrange = cinemaArrange;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
