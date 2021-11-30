package com.ptitbapt.celsusandfahrenheitrolegames.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private AnchorPane Details;

    @FXML
    private AnchorPane Menu;

    @FXML
    private Button btnConverter;

    @FXML
    private Button btnRPG;

    @FXML
    private AnchorPane pageCentre;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    private VBox form1;

    @FXML
    private VBox pageDetails;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnConverter.setOnMouseClicked(btnConverterAction -> {

        });
    }
}