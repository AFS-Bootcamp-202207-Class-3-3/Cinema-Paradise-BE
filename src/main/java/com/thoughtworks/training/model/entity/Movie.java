package com.thoughtworks.training.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Movie {

    @Id
    private String id;
    @Column(name = "titlechinese")
    private String titleChinese;
    @Column(name = "titleenglish")
    private String titleEnglish;
    @Column(name = "imageurl")
    private String imageUrl;
    private String director;
    private String actors;
    private String types;
    @Column(name = "releasedate")
    private Date releaseDate;
    private Integer duration;
    private String introduction;
    @Column(name = "rotationimageurl")
    private String rotationImageUrl;
    private Double score;

    public Movie() {
    }

    public Movie(String titleChinese, String titleEnglish, String imageUrl, String director, String actors, String types, Date releaseDate, Integer duration, String introduction, String rotationImageUrl, Double score) {
        this.titleChinese = titleChinese;
        this.titleEnglish = titleEnglish;
        this.imageUrl = imageUrl;
        this.director = director;
        this.actors = actors;
        this.types = types;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.introduction = introduction;
        this.rotationImageUrl = rotationImageUrl;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitleChinese() {
        return titleChinese;
    }

    public void setTitleChinese(String titleChinese) {
        this.titleChinese = titleChinese;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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

    public String getRotationImageUrl() {
        return rotationImageUrl;
    }

    public void setRotationImageUrl(String rotationImageUrl) {
        this.rotationImageUrl = rotationImageUrl;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
