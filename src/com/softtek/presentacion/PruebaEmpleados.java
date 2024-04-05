package com.softtek.presentacion;

import com.softtek.modelo.Gerente;
import com.softtek.modelo.Operador;
import com.softtek.modelo.Vendedor;

public class PruebaEmpleados {

    public static void main(String[] args) {
        Gerente g = new Gerente("Jose",3000.00,500.00);
        Vendedor v = new Vendedor("Pepe",1500.00,20,0.50);
        Operador o = new Operador("Manuela",2000.00,200,0.25);
        System.out.println(g.calcularNomina());
        System.out.println(v.calcularNomina());
        System.out.println(o.calcularNomina());
    }
}
