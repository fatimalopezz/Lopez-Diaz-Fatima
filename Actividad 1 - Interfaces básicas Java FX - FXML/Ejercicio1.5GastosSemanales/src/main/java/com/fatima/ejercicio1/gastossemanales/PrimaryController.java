package com.fatima.ejercicio1.gastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;

    @FXML
    private TextField txtRefrigerios;

    @FXML
    private TextField txtTransporte;

    @FXML
    private TextField txtTelefonia;

    @FXML
    private TextField txtOtros;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtGastoMayor;

    @FXML
    private void calcularEstadisticas() {
        try {
            double alimentacion = Double.parseDouble(txtAlimentacion.getText().trim());
            double refrigerios = Double.parseDouble(txtRefrigerios.getText().trim());
            double transporte = Double.parseDouble(txtTransporte.getText().trim());
            double telefonia = Double.parseDouble(txtTelefonia.getText().trim());
            double otros = Double.parseDouble(txtOtros.getText().trim());

            double total = alimentacion + refrigerios + transporte
                    + telefonia + otros;

            txtTotal.setText(formatearNumero(total));

            double mayor = alimentacion;
            String categoriaMayor = "Alimentación";

            if (refrigerios > mayor) {
                mayor = refrigerios;
                categoriaMayor = "Refrigerios";
            }

            if (transporte > mayor) {
                mayor = transporte;
                categoriaMayor = "Transporte";
            }

            if (telefonia > mayor) {
                mayor = telefonia;
                categoriaMayor = "Telefonía";
            }

            if (otros > mayor) {
                mayor = otros;
                categoriaMayor = "Otros";
            }

            txtGastoMayor.setText(categoriaMayor);

        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Datos no válidos");
            alerta.setContentText("Ingresa un número válido en cada campo de gastos.");
            alerta.showAndWait();
        }
    }

    private String formatearNumero(double numero) {
        if (numero == Math.floor(numero)) {
            return String.valueOf((long) numero);
        }
        return String.valueOf(numero);
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();

        txtTotal.clear();
        txtGastoMayor.clear();
    }
}
