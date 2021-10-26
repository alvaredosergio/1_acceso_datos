import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import animal.Perro;

public class ArrayPerro {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Roky");
        Perro perro2 = new Perro("Lasi");
        Perro perro3 = new Perro("Tula");
        Perro perro4 = new Perro("Lana");
        Perro perro5 = new Perro("Hugo");
        
        // Utilizando List, nos permite crear una lista de objetos con la capacidad de DUPLICADO DE OBJETOS.
        List <Perro> perros = new ArrayList <Perro>();

        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);

        System.out.println(perro1.getNombre());
        System.out.println(perro2.getNombre());
        System.out.println(perro3.getNombre());
        System.out.println(perro4.getNombre());
        System.out.println(perro5.getNombre());

        System.out.println();
        System.out.println();

//-----------------------------------------------------------------

        Perro perro6 = new Perro("Roky");
        Perro perro7 = new Perro("Lasi");
        Perro perro8 = new Perro("Tula");
        Perro perro9 = new Perro("Lana");
        Perro perro10 = new Perro("Hugo");

        // Utilizando HashSet, nos permite crear una lista de objetos SIN LA CAPACIDAD DE DUPLICADOS.
        Set <Perro> dogs = new HashSet <Perro>();

        dogs.add(perro6);
        dogs.add(perro7);
        dogs.add(perro8);
        dogs.add(perro9);
        dogs.add(perro10);

        // con este bucle For, utilizado con colecciones, nos recorrerá todos los objetos de la lista HashSet.
        for(Perro dog:dogs){
            System.out.println(dog.getNombre());
        }

        //Collection está por encima de todos sus herencias.
        Collection <Perro> dogss = new HashSet <Perro>();
        
    }
}
