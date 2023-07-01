package com.example.tourplanner.FXApp.view;

import com.example.tourplanner.FXApp.viewmodel.TourListViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class TourListController {

    private final TourListViewModel tourListViewModel;

    @FXML
    public Button addTour;
    @FXML
    public Button modifyTour;
    @FXML
    public Button deleteTour;
    @FXML
    public ListView TourListView;

    public TourListController(TourListViewModel tourListViewModel) {
        this.tourListViewModel = tourListViewModel;
    }

    public void addTour(ActionEvent actionEvent) {
        tourListViewModel.addTour();
    }

    public void modTour(ActionEvent actionEvent) {
    }

    public void delTour(ActionEvent actionEvent) {
    }
}
