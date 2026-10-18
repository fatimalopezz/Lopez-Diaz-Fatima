package com.fatima.ejercicio1.cifrasdivisores;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = loadFXML();

        Scene scene = new Scene(root);
        stage.setTitle("Cifras y Divisores de un Número");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private Parent loadFXML() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                App.class.getResource("primary.fxml")
        );
        return loader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
