package com.thoughtworks.training.model.dto.request;

public class MovieRequest {

    private String id;
    private String titleChinese;
    private String titleEnglish;
    private String imageUrl;
    private String director;
    private String actors;
    private String types;
    private String releaseDate;
    private Integer duration;
    private String introduction;
    private String rotationImageUrl;
    private Double score;

    public MovieRequest() {
    }

    public MovieRequest(String titleChinese, String titleEnglish, String imageUrl, String director, String actors, String types, String releaseDate, Integer duration, String introduction, String rotationImageUrl, Double score) {
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
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
