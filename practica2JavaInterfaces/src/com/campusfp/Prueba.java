package com.campusfp;

public class Prueba {
    public static void main(String[] args) {
        Observador obs1 = new Observador("Manolito");
        iVacaObserver obs2 = new Observador("Juan");
        Vaca vaca1 = new Vaca();

        vaca1.agregarObservador(obs1);
        vaca1.agregarObservador(obs2);
        vaca1.mugir();
        vaca1.mover();
    }
}
