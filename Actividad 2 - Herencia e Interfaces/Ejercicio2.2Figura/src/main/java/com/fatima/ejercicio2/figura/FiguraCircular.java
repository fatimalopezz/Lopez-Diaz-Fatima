package com.fatima.ejercicio2.figura;

public class FiguraCircular extends Figura2D {

    protected int radio;

    public FiguraCircular(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        return "Se imprime una FiguraPlana...";
    }
}