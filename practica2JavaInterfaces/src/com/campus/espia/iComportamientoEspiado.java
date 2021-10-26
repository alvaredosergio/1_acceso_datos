package com.campus.espia;

public interface iComportamientoEspiado {
    void agregarObservador(iEspia esp);
    void entrar();
    void salir();
    void notificar(boolean accion);
}
