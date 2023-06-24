module com.example.heightcalculatorgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heightcalculatorgui to javafx.fxml;
    exports com.example.heightcalculatorgui;
    exports events;
    opens events to javafx.fxml;
}