package com.softtek.presentacion;

import com.softtek.modelo.Bateria;
import com.softtek.modelo.Flauta;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.InstrumentoMusical;

public class PruebaInstrumentos {

    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra();
        InstrumentoMusical bataca = new Bateria();
        InstrumentoMusical ham = new Flauta();
        InstrumentoMusical[] instrumentos = {guido,bataca,ham};
        for (InstrumentoMusical i: instrumentos
             ) {
            System.out.println(i.emitirSonido());
        }
    }
}
