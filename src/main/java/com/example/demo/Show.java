package com.example.demo;

public class Show {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    private Integer rating;

    public Show(String title, Integer rating) {
        this.title = title;
        this.rating = rating;
    }


}
