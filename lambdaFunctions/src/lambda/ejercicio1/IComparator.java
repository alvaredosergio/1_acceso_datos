package lambda.ejercicio1;

import java.util.Comparator;

public class IComparator implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        if(o1.getNomina() > o2.getNomina()){
            return 1;
        }
        else if(o1.getNomina() < o2.getNomina()){
            return -1;
        }
        return 0;
    }
}
