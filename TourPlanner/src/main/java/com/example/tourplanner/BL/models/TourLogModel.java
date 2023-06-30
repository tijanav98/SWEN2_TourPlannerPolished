package com.example.tourplanner.BL.models;

import java.io.Serializable;

public class TourLogModel implements Serializable {

    private int id;

    private String dateTime;

    private String comment;

    private Double difficulty;

    private String totalTime;

    private Double rating;

    public TourLogModel(int id, String dateTime, String comment, Double difficulty, String totalTime, Double rating){
        this.id = id;
        this.dateTime = dateTime;
        this.comment = comment;
        this.difficulty = difficulty;
        this.totalTime = totalTime;
        this.rating = rating;
    }

    public TourLogModel(){}

}
