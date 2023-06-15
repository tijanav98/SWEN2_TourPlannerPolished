module com.example.tourplanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.tourplanner to javafx.fxml;
    exports com.example.tourplanner;
}