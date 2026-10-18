package com.fatima.ejercicio2.figura;

import java.util.Locale;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + "\n\nSe imprime un Circulo con radio: " + radio
                + ", area: " + String.format(Locale.US, "%.2f",
                        calcularArea())
                + ", perimetro: " + String.format(Locale.US, "%.2f",
                        calcularPerimetro());
    }
}