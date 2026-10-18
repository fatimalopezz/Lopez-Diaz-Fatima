package com.fatima.ejercicio2.persona;

public class Profesor extends Persona {

    private int numEmpleado;

    public Profesor(int numEmpleado) {
        super();
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad
                + ", con clave " + numEmpleado;
    }
}