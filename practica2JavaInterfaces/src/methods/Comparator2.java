package methods;

import java.util.Comparator;

import classes.Producto;

public class Comparator2 implements Comparator <Producto> {
    private int numero;

    public Comparator2(int numero) {
        this.numero = numero;
    }


    /*Ordenar alfabeticamente*/
    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

    
    
}