module com.fatima.ejercicio1.gastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fatima.ejercicio1.gastossemanales to javafx.fxml;
    exports com.fatima.ejercicio1.gastossemanales;
}
