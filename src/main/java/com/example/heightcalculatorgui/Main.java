package com.example.heightcalculatorgui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String[] UNIT_OPTIONS = {"cm", "feet"};
    public static ComboBox<String> unitComboBox;
    public static TextField heightTextField;
    public static Button convertButton;
    public static Label resultLabel;

    public static Label creditLabel;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Height Calculator v1");
        unitComboBox = new ComboBox<>();
        unitComboBox.getItems().addAll(UNIT_OPTIONS);
        unitComboBox.setValue(UNIT_OPTIONS[0]);
        heightTextField = new TextField();
        heightTextField.setPromptText("Enter height");
        convertButton = new Button("Convert");
        resultLabel = new Label();
        creditLabel = new Label();
        convertButton.setOnAction(new ConvertButtonHandler());
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(new Label("Select unit:"), 0, 0);
        gridPane.add(unitComboBox, 1, 0);
        gridPane.add(new Label("Enter height:"), 0, 1);
        gridPane.add(heightTextField, 1, 1);
        gridPane.add(convertButton, 1, 2);
        gridPane.add(resultLabel, 0, 3, 2, 1);
        gridPane.add(creditLabel, 0, 5, 3, 1);
        creditLabel.setText("Made by Larssies");
        VBox vbox = new VBox(gridPane);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}