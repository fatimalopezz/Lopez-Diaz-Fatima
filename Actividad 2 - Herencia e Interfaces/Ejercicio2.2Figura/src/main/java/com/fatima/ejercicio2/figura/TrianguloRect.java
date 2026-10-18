package com.fatima.ejercicio2.figura;

import java.util.Locale;

public class TrianguloRect extends FiguraRect {

    public TrianguloRect(int alto, int ancho) {
        super(ancho, alto);
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + "\n\nSe imprime un Triangulo con alto: " + alto
                + ", ancho: " + ancho
                + ", area: " + String.format(Locale.US, "%.2f",
                        calcularArea())
                + ", perimetro: " + String.format(Locale.US, "%.2f",
                        calcularPerimetro());
    }
}