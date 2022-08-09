package com.thoughtworks.training.model.dto;

import java.util.Date;

public class MovieResponse {

    private String id;
    private String titlechinese;
    private String titleenglish;
    private String imageurl;
    private String director;
    private String actors;
    private String types;
    private Date releasedate;
    private Integer duration;
    private String introduction;
    private String rotationimageurl;
    private Double score;

    public MovieResponse() {
    }

    public MovieResponse(String id, String titlechinese, String titleenglish, String imageurl, String director, String actors, String types, Date releasedate, Integer duration, String introduction, String rotationimageurl, Double score) {
        this.id = id;
        this.titlechinese = titlechinese;
        this.titleenglish = titleenglish;
        this.imageurl = imageurl;
        this.director = director;
        this.actors = actors;
        this.types = types;
        this.releasedate = releasedate;
        this.duration = duration;
        this.introduction = introduction;
        this.rotationimageurl = rotationimageurl;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitlechinese() {
        return titlechinese;
    }

    public void setTitlechinese(String titlechinese) {
        this.titlechinese = titlechinese;
    }

    public String getTitleenglish() {
        return titleenglish;
    }

    public void setTitleenglish(String titleenglish) {
        this.titleenglish = titleenglish;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRotationimageurl() {
        return rotationimageurl;
    }

    public void setRotationimageurl(String rotationimageurl) {
        this.rotationimageurl = rotationimageurl;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
