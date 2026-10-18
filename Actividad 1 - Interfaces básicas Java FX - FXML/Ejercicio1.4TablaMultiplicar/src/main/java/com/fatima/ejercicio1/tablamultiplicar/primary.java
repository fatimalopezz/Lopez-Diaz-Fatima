package com.fatima.ejercicio1.tablamultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class primary {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtResultado;

    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText().trim());

        StringBuilder tabla = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            tabla.append(numero)
                 .append(" x ")
                 .append(i)
                 .append(" = ")
                 .append(numero * i)
                 .append("\n");
        }

        txtResultado.setText(tabla.toString());
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtResultado.clear();
    }
}
