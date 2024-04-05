package com.softtek.modelo;

public class Guitarra extends InstrumentoMusical{

    private String tipoCuerdas;

    @Override
    public String emitirSonido() {
        return super.emitirSonido()+" de guitarra";
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public Guitarra() {
        super();
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
