package com.example.loginfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(LogInApplication.class.getResource("LogIn-view.fxml"));


        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        scene.getStylesheets().add(getClass().getResource("LogIn.css").toExternalForm());
        stage.setTitle("LogIn with FXML!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}