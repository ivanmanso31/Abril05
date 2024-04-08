package com.softtek.modelo;

public class Flauta extends InstrumentoMusical{

    private String material;

    @Override
    public String emitirSonido() {
        return "sonido de flauta";
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public Flauta() {
        super();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
