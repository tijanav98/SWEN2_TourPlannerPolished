package com.example.tourplanner.DAL.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TourLog {
    private String dateTime;
    private String comment;
    private Double difficulty;
    private String totalTime;
    private Double rating;
}
