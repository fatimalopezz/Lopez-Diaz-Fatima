module com.fatima.ejercicio1.tablamultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fatima.ejercicio1.tablamultiplicar to javafx.fxml;
    exports com.fatima.ejercicio1.tablamultiplicar;
}
