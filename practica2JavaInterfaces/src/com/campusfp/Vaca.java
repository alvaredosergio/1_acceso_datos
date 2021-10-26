package com.campusfp;

import java.util.ArrayList;
import java.util.List;

public class Vaca implements iComportamientoVaca {

    List <iVacaObserver> observadores = new ArrayList<iVacaObserver>();
    
    @Override
    public void agregarObservador(iVacaObserver vo) {
        observadores.add(vo);    
    }

    public void mover() {
        System.out.println("La vaca se está moviendo...");
        for(iVacaObserver vo: observadores){
            vo.siLaVacaSeMueve();
        }
    }

    public void mugir() {
        System.out.println("La vaca dijo muuuu...");
        for(iVacaObserver vo: observadores){
            vo.siLaVacaMuge();
        }

    }

    /*public void mover() {
        System.out.println("La vaca se está moviendo...");
        notificar(false);
    }

    public void mugir() {
        System.out.println("La vaca dijo muuuu...");
        notificar(true);

    }*/

    @Override
    public void notificar(boolean accion) {
        for(iVacaObserver vo: observadores){
            if(accion)
                vo.siLaVacaMuge();
            else
                vo.siLaVacaSeMueve();
        }
    }

    
    
}
