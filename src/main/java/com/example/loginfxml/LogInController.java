package com.example.loginfxml;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LogInController {
    @FXML
    private Text actiontarget;

    @FXML
    protected void handleSubmitButtonAction() {
        actiontarget.setText("Sing in button was pressed!");
    }
}