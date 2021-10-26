package com.campus.espia;

import java.util.ArrayList;
import java.util.List;

public class Espiado implements iComportamientoEspiado{

    List <iEspia> espias = new ArrayList<iEspia>();

    @Override
    public void agregarObservador(iEspia esp) {
        espias.add(esp);
        
    }

    @Override
    public void entrar() {
        System.out.println("El espiado está entrando...");
        notificar(true);
        
    }

    @Override
    public void salir() {
        System.out.println("El espiado está saliendo...");
        notificar(false);
        
    }

    @Override
    public void notificar(boolean accion) {
        for(iEspia esp: espias){
            if(accion)
                esp.siEntra();
            else
                esp.siSale();
        }
    }
    
    
}
