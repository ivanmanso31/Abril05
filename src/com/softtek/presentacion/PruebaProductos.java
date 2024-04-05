package com.softtek.presentacion;

import com.softtek.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class PruebaProductos {

    public static void main(String[] args) {
        ProductoPerecedero p = new ProductoPerecedero("zumo",3,2.5,
                LocalDate.of(2024,4,12),LocalDate.of(2024,4,10));
        System.out.println(p.cantidadAPagar());
        System.out.println(p.tiempoConsumicion());
    }

}
