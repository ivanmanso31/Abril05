package com.softtek.modelo;

public class Gerente extends Empleado{

    private double bono;

    @Override
    public double calcularNomina() {
        return (sueldo+bono)*porcentaje;
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public Gerente() {
        super();
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
