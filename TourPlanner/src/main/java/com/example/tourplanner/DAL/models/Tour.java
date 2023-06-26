package com.example.tourplanner.DAL.models;

import lombok.Getter;


@Getter

public class Tour {
    private int id;
    private String name;
    private String description;
    private String from;
    private String to;
    private String transportType;
    private double distance;
    private String estimatedTime;
    private String routeInfo;

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public void setTo(String to){
        this.to = to;
    }

    public void setTransportType(String transportType){
        this.transportType = transportType;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public void setEstimatedTime(String estimatedTime){
        this.estimatedTime = estimatedTime;

    }

    public void setRouteInfo (String routeInfo){
        this.routeInfo = routeInfo;
    }
    public Tour(int id, String name, String description, String from, String to, String transportType, double distance, String estimatedTime, String routeInfo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.from = from;
        this.to = to;
        this.transportType = transportType;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
        this.routeInfo = routeInfo;
    }
}
