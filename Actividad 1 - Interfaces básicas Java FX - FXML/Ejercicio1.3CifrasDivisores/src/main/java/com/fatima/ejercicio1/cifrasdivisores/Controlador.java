package com.fatima.ejercicio1.cifrasdivisores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador implements Initializable {

    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblCifras;

    @FXML
    private Label lblSumaImpares;

    @FXML
    private Label lblSumaPares;

    @FXML
    private Label lblSumaTotal;

    @FXML
    private Label lblMayor;

    @FXML
    private Label lblMenor;

    @FXML
    private TextArea txtDivisores;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        limpiar();
    }

    @FXML
    private void analizar() {
        String entrada = txtNumero.getText().trim();

        if (entrada.isEmpty()) {
            return;
        }

        int numero;

        try {
            numero = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            return;
        }

        String cifras = String.valueOf(Math.abs((long) numero));

        int cantidadCifras = cifras.length();
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaTotal = 0;
        int mayor = 0;
        int menor = 9;

        for (int i = 0; i < cifras.length(); i++) {
            int cifra = cifras.charAt(i) - '0';

            sumaTotal += cifra;

            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }
        }

        lblCifras.setText(String.valueOf(cantidadCifras));
        lblSumaImpares.setText(String.valueOf(sumaImpares));
        lblSumaPares.setText(String.valueOf(sumaPares));
        lblSumaTotal.setText(String.valueOf(sumaTotal));
        lblMayor.setText(String.valueOf(mayor));
        lblMenor.setText(String.valueOf(menor));

        StringBuilder lista = new StringBuilder();
        long valor = Math.abs((long) numero);

        if (valor == 0) {
            lista.append("Todo entero distinto de cero divide a 0.");
        } else {
            for (long i = 1; i <= valor; i++) {
                if (valor % i == 0) {
                    lista.append(i).append("\n");
                }
            }
        }

        txtDivisores.setText(lista.toString());
    }

    @FXML
    private void limpiar() {
        if (txtNumero != null) {
            txtNumero.clear();
        }

        if (lblCifras != null) {
            lblCifras.setText("");
            lblSumaImpares.setText("");
            lblSumaPares.setText("");
            lblSumaTotal.setText("");
            lblMayor.setText("");
            lblMenor.setText("");
            txtDivisores.clear();
        }
    }
}
