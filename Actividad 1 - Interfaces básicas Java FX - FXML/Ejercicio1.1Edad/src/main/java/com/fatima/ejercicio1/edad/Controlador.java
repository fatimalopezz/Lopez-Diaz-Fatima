package com.fatima.ejercicio1.edad;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador implements Initializable {

    @FXML private TextField txtFechaNacimiento;
    @FXML private Label lblResultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblResultado.setText("");
    }

    @FXML
    private void calcularEdad() {
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/uuuu");

        LocalDate nacimiento =
                LocalDate.parse(txtFechaNacimiento.getText(), formato);

        LocalDate actual = LocalDate.now();

        Period edad = Period.between(nacimiento, actual);

        lblResultado.setText(
                "Edad: " + edad.getYears() + " años y "
                + edad.getMonths() + " meses"
        );
    }

    @FXML
    private void limpiar() {
        txtFechaNacimiento.clear();
        lblResultado.setText("");
    }
}
