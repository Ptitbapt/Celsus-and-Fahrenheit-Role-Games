package com.ptitbapt.celsusandfahrenheitrolegames.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class CelsiusFarController implements Initializable {

    @FXML
    private Slider SliderCelsius;

    @FXML
    private Slider SliderFare;

    @FXML
    private HBox Temperature;

    @FXML
    private Label TmpCelsus;

    @FXML
    private Label TmpFare;

    @FXML
    private VBox formTemperature;

    @FXML
    private TextField txtCelsius;

    @FXML
    private TextField txtFare;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtCelsius.setOnKeyReleased(actionKEY -> {
            double celsius = Double.parseDouble(txtCelsius.getText());
            double far = Math.round(celsius * 9 / 5 + 32);
            txtFare.setText(String.valueOf(far));
        });


        txtFare.setOnKeyReleased(actionKEY2 -> {
            double far = Double.parseDouble(txtFare.getText());
            double celsius = Math.round((far - 32) / 1.8);
            txtCelsius.setText(String.valueOf(celsius));
        });

        txtCelsius.setOnKeyReleased(actionKEY -> {
            double convFah = Double.parseDouble(txtCelsius.getText());
            double fahResult = ((convFah*1.8) + 32);
            txtFare.setText(String.valueOf(fahResult));
            SliderCelsius.setValue(convFah);
            SliderFare.setValue(fahResult);
        });

        txtFare.setOnKeyReleased(actionKEY -> {
            double convCelsius = Double.parseDouble(txtFare.getText());
            double celsiusResult = ((convCelsius/1.8) - 32);
            txtCelsius.setText(String.valueOf(celsiusResult));
            SliderCelsius.setValue(convCelsius);
            SliderFare.setValue(celsiusResult);
        });

    }
}
