package com.example.heightcalculatorgui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static com.example.heightcalculatorgui.Main.*;

public class ConvertButtonHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        String selectedUnit = unitComboBox.getValue();
        String heightStr = heightTextField.getText();

        if (selectedUnit.equals("cm")) {
            try {
                double heightCm = Double.parseDouble(heightStr);
                calHeightToFeet(heightCm);
            } catch (NumberFormatException e) {
                resultLabel.setText("You can only use numbers! (example: 145.3)");
            }
        } else if (selectedUnit.equals("feet")) {
            try {
                double heightFeet = Double.parseDouble(heightStr);
                calHeightToCm(heightFeet);
            } catch (NumberFormatException e) {
                resultLabel.setText("You can only use numbers! (example: 5.3)");
            }
        }
    }

    public void calHeightToFeet(double heightCm) {

        try {
            double feet = heightCm / 30.48;
            resultLabel.setText("You are " + String.format("%.1f", feet) + " feet tall");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            resultLabel.setText("You can only use numbers!");
        }
    }

    public void calHeightToCm(double heightFeet) {
        try {
            double cm = heightFeet * 30.48;
            resultLabel.setText("You are " + (int) cm + " cm tall");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            resultLabel.setText("You can only use numbers!");
        }
    }

}
