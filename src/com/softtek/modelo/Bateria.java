package com.softtek.modelo;

public class Bateria extends InstrumentoMusical{

    private int noPlatillos;

    @Override
    public String emitirSonido() {
        return super.emitirSonido()+" de bateria";
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public Bateria() {
        super();
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}
