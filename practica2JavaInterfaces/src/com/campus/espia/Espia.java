package com.campus.espia;

public class Espia implements iEspia {

    @Override
    public void siEntra() {
        System.out.println("El espiado HA ENTRADO.");
    }

    @Override
    public void siSale() {
        System.out.println("El espiado HA SALIDO.");        
    }
    
}
