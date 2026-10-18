module com.fatima.ejercicio1.cifrasdivisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fatima.ejercicio1.cifrasdivisores to javafx.fxml;
    exports com.fatima.ejercicio1.cifrasdivisores;
}
