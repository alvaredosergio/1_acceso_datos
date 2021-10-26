package com.campus.espia;

public class Prueba {
    public static void main(String[] args) {
        Espia espia1 = new Espia();
        Espiado espiado1 = new Espiado();

        espiado1.agregarObservador(espia1);
        
        espiado1.entrar();
        espiado1.salir();
    }
}
