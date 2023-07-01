package com.example.tourplanner;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    private final String[] tours = {"Tour 1", "Tour 2", "Tour 3"};
    private final String[] tourLogs = {"Log 1", "Log 2", "Log 3"};
    @Override
    public void start(Stage primaryStage) {
        // Create a label

            // Create lists for the tours and the tour logs
            ListView<String> tourList = new ListView<>();
            ListView<String> tourLogList = new ListView<>();
            tourList.getItems().addAll(tours);
            tourLogList.getItems().addAll(tourLogs);

            // When a tour is selected, update the tour logs list
            tourList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                // replace with code to update tourLogList based on selected tour
            });

            // Create buttons for the tour operations
            Button addButton = new Button("Add Tour");
            Button deleteButton = new Button("Delete Tour");
            Button editButton = new Button("Edit Tour");

            // Add the buttons to a layout
            VBox buttonLayout = new VBox(10);  // 10px spacing
            buttonLayout.getChildren().addAll(addButton, deleteButton, editButton);

            // Create a layout for the tours side
            VBox toursLayout = new VBox(10);
            toursLayout.getChildren().addAll(tourList, buttonLayout);

            // Create the main layout
            BorderPane mainLayout = new BorderPane();
            mainLayout.setLeft(toursLayout);
            mainLayout.setCenter(tourLogList);

            // Create the scene and show the stage
            Scene scene = new Scene(mainLayout, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Tour Planner");
            primaryStage.show();
        }

    public static void main(String[] args) {
        launch();
    }
}