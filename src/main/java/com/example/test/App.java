package com.example.test;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        AppNavigator.setStage(stage);

        AppNavigator.showView(
                "lista-view.fxml",
                "Listado de estudiantes"
        );
    }

    public static void main(String[] args) {
        launch(args);
    }
}