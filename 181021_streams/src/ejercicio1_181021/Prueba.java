package ejercicio1_181021;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {

        Alumnos al1 = new Alumnos("Paco", 17);
        Alumnos al2 = new Alumnos("Raul", 16);
        Alumnos al3 = new Alumnos("Maria", 21);
        Alumnos al4 = new Alumnos("Sergio", 20);
        Alumnos al5 = new Alumnos("Julian", 23);

        List <Alumnos> alumnos = new ArrayList<Alumnos>();
        alumnos.add(al1);
        alumnos.add(al2);
        alumnos.add(al3);
        alumnos.add(al4);
        alumnos.add(al5);

        for (Alumnos alum : alumnos) {
            if(alum.getEdad() > 18){
                System.out.println("Alumno: " + alum.getNombre() + "\nEdad: " + alum.getEdad() + " años\n");
            }
        }
    }
}
