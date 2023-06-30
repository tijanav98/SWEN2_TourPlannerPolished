package com.example.tourplanner.FXApp.view;
import com.example.tourplanner.FXApp.viewmodel.MainWindowViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainWindowController {

    private final MainWindowViewModel mainWindowViewModel;
    @FXML
    public MenuItem createTourReport;
    @FXML
    public MenuItem importFileMenu;
    @FXML
    public MenuItem exportFileMenu;
    @FXML
    public MenuItem createSummarizeReport;
    @FXML
    public HBox searchBar;
    @FXML
    public VBox tourListFX;
    @FXML
    public VBox tourDetailsFX;

    public MainWindowController(MainWindowViewModel mainWindowViewModel) {
        this.mainWindowViewModel = mainWindowViewModel;
    }

    public void openImportFileWindow(ActionEvent actionEvent) {
    }
}
