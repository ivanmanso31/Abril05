package com.softtek.presentacion;

import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;

public class PruebaFiguras {

    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(1.2);
        cPeque.setX(4);
        cPeque.setY(3);
        Figura cMediano = new Cuadrado(1,1,2.5);
        Triangulo tPeque = new Triangulo();
        tPeque.setX(-1);
        tPeque.setY(-2);
        tPeque.setAltura(3);
        tPeque.setBase(3.5);
        Figura tMediano = new Triangulo(3,6,4,4);
        Figura[] figuras = {cPeque,cMediano,tPeque,tMediano};
        for (Figura f: figuras) {
            System.out.println(f.calcularArea());
        }
    }
}
