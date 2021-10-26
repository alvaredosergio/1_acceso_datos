package com.campusfp;

public interface iComportamientoVaca{
    void agregarObservador(iVacaObserver vo);
    void notificar(boolean accion);
}
