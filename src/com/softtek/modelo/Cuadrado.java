package com.softtek.modelo;

public class Cuadrado extends Figura{

    private double lado;

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public String mostrarPosicion() {
        return super.mostrarPosicion();
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado() {
        super();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
