package lambda.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Muestra {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1,"Sergio",1500);
        Empleado empleado2 = new Empleado(2,"Mario",2100);
        Empleado empleado3 = new Empleado(3,"Lucia",1200);
        Empleado empleado4 = new Empleado(4,"Julian",1800);

        ArrayList <Empleado> lista = new ArrayList <Empleado>();
        lista.add(empleado1);
        lista.add(empleado2);
        lista.add(empleado3);
        lista.add(empleado4);

        IComparator nominaComparator = new IComparator();
        
        // Esta forma de ordenar es sin FunctionalInterface
        Collections.sort(lista, nominaComparator);

        // Esta forma de ordenar es con FunctionalInterface
        Collections.sort(lista, (o1,o2) -> o1.getNomina() > o2.getNomina() ? 1 : -1);

        /* ELVIS OPERATOR */
        /* if(x > y){
                return 1;
            else{
                return -1;
            }*/

        /* ES IGUAL QUE LO SIGUIENTE: 
        x > y ? 1 : -1;
        */    
                
        for (Empleado emp : lista) {
            System.out.println(emp);
        }

        
    }
}
