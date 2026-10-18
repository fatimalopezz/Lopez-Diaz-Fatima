module com.fatima.ejercicio1.edad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fatima.ejercicio1.edad to javafx.fxml;
    exports com.fatima.ejercicio1.edad;
}
