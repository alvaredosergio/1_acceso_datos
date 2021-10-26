package com.campusfp;

public class Observador implements iVacaObserver {
    String nombre;

    @Override
    public void siLaVacaMuge() {
        System.out.println("Vaca mugiendo...");
    }

    @Override
    public void siLaVacaSeMueve() {
        System.out.println("Vaca en movimiento...");
    }

    public Observador(String nombre) {
        this.nombre = nombre;
    }

    
    
}
