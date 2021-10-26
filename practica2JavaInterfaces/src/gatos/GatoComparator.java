package gatos;

import java.util.Comparator;


public class GatoComparator implements Comparator <Gatos> {

    @Override
    public int compare(Gatos g1, Gatos g2) {
        return g1.getNombre().compareTo(g2.getNombre());
    }
}

  