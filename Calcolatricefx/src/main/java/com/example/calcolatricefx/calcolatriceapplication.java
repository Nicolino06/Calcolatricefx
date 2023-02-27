package com.example.calcolatricefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class calcolatriceapplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(calcolatriceapplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 550);
        stage.setTitle("Calcolatricefx");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}