package com.fatima.ejercicio1.dinero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            App.class.getResource(
                "/com/fatima/ejercicio1/dinero/primary.fxml"
            )
        );

        Parent root = loader.load();

        Scene scene = new Scene(root, 480, 390);
        stage.setTitle("Desglose de dinero");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
