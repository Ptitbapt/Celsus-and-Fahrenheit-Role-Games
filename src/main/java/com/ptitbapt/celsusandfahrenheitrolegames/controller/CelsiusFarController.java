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

    }
}
