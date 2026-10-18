package com.fatima.ejercicio2.figura;

public class Ejercicio22Figura {

    public static void main(String[] args) {

        Figura2D f = new TrianguloRect(3,4);
        SOUT(f.imprimeFigura());

        f = new Circulo(3);
        SOUT(f.imprimeFigura());
    }

    public static void SOUT(String texto) {
        System.out.println(texto);
    }
}
