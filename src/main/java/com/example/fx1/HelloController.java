package com.example.fx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class HelloController {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnDot;

    @FXML
    private HBox btnEquals;

    @FXML
    private Button btnPlus;

    @FXML
    private TextField tfScreen;

    @FXML
    void onBtn1Clicked(ActionEvent event) {
        String screenContent = tfScreen.getText().toString();
        screenContent+="1";
        tfScreen.setText(screenContent);

    }

    @FXML
    void onButton2Clicked(ActionEvent event) {

    }

    @FXML
    void onButton3Clicked(ActionEvent event) {

    }

    @FXML
    void onButtonDotClicked(ActionEvent event) {

    }

    @FXML
    void onButtonEquals(ActionEvent event) {

    }

    @FXML
    void onButtonPlisClicked(ActionEvent event) {

    }

    @FXML
    void onButtonZeroClicked(ActionEvent event) {

    }

}
