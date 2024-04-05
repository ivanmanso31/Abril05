package com.softtek.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProductoPerecedero extends Producto{

    private LocalDate fCaducidad;
    private LocalDate fFabricación;

    public long tiempoConsumicion(){
        return fCaducidad.until(fFabricación, ChronoUnit.DAYS);
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricación) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricación = fFabricación;
    }

    public ProductoPerecedero() {
        super();
    }

    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getfFabricación() {
        return fFabricación;
    }

    public void setfFabricación(LocalDate fFabricación) {
        this.fFabricación = fFabricación;
    }
}
