package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField newTextField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(newTextField.getText());
    }
}