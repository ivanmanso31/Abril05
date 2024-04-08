package com.softtek.modelo;

public abstract class Figura {

    protected int x;
    protected int y;

    public abstract double calcularArea();

    public String mostrarPosicion(){
        return "X: "+x+" Y: "+y;
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
