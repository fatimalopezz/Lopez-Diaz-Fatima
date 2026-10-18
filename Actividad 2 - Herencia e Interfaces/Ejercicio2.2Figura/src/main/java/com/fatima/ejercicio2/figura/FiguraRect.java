package com.fatima.ejercicio2.figura;

public class FiguraRect extends Figura2D {

    protected int ancho;
    protected int alto;

    public FiguraRect(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return ancho + alto
                + Math.sqrt(ancho * ancho + alto * alto);
    }

    @Override
    public String imprimeFigura() {
        return "Se imprime una FiguraPlana...";
    }
}