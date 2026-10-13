package com.example.test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppNavigator {

    private static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static void showView(
            String fxml,
            String title) {

        try {

            Parent root =
                    FXMLLoader.load(
                            AppNavigator.class
                                    .getResource(
                                            "/com/example/test/view/" + fxml
                                    )
                    );

            mainStage.setTitle(title);
            mainStage.setScene(
                    new Scene(root, 800, 500)
            );

            mainStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
