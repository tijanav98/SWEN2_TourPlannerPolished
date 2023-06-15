package com.example.tourplanner.Models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tour {
    private String name;
    private String description;
    private String from;
    private String to;
    private String transportType;
    private double distance;
    private String estimatedTime;
    private String routeInfo;
}
