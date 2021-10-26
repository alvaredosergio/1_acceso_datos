package methods;

import java.util.Comparator;

import classes.Producto;

public class Comparator1 implements Comparator <Producto> {


    /*Ordenar alfabeticamente*/
    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

    
    
}
