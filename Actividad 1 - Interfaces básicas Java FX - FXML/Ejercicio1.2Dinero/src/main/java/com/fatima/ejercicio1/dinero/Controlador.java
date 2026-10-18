package com.fatima.ejercicio1.dinero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador implements Initializable {

    @FXML
    private TextField txtDinero;

    @FXML
    private Label lbl500;
    @FXML
    private Label lbl200;
    @FXML
    private Label lbl100;
    @FXML
    private Label lbl50;
    @FXML
    private Label lbl20;
    @FXML
    private Label lbl10;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        limpiar();
    }

    @FXML
    private void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());

        int cantidad;

        cantidad = dinero / 500;
        lbl500.setText(String.valueOf(cantidad));
        dinero = dinero % 500;

        cantidad = dinero / 200;
        lbl200.setText(String.valueOf(cantidad));
        dinero = dinero % 200;

        cantidad = dinero / 100;
        lbl100.setText(String.valueOf(cantidad));
        dinero = dinero % 100;

        cantidad = dinero / 50;
        lbl50.setText(String.valueOf(cantidad));
        dinero = dinero % 50;

        cantidad = dinero / 20;
        lbl20.setText(String.valueOf(cantidad));
        dinero = dinero % 20;

        cantidad = dinero / 10;
        lbl10.setText(String.valueOf(cantidad));
        dinero = dinero % 10;

        cantidad = dinero / 5;
        lbl5.setText(String.valueOf(cantidad));
        dinero = dinero % 5;

        cantidad = dinero / 2;
        lbl2.setText(String.valueOf(cantidad));
        dinero = dinero % 2;

        cantidad = dinero / 1;
        lbl1.setText(String.valueOf(cantidad));
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();

        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");
    }
}
