package gatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Gatos implements Comparable <Gatos> {
    String nombre;
    String raza;
    String color;
    
    public Gatos(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gatos: [nombre = " + nombre + ", raza = " + raza + ", color = " + color + "]";
    }
    
    @Override
    public int compareTo(Gatos g1) {
        return 0;
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del gato: ");
        String name = sc.nextLine();

        System.out.println("Raza del gato: ");
        String race = sc.nextLine();

        System.out.println("Color del gato: ");
        String colour = sc.nextLine();*/

        Gatos gato1 = new Gatos ("Raul","Siames","Azul");
        Gatos gato2 = new Gatos ("Tommy","Persa","Gris");
        Gatos gato3 = new Gatos ("Guantes","Esfinge","Blanco");
        Gatos gato4 = new Gatos ("Sucio","Montés","Canela");
        Gatos gato5 = new Gatos ("Juancho","Tractor","Naranja");

        List <Gatos> gatitos = new ArrayList <Gatos>();
        gatitos.add(gato1);
        gatitos.add(gato2);
        gatitos.add(gato3);
        gatitos.add(gato4);
        gatitos.add(gato5);

        /*Ordenar por Nombre Alfabeticamente*/
        System.out.println("Gatos ordenados por NOMBRE:");
        GatoComparator nameSort = new GatoComparator();
		Collections.sort(gatitos, nameSort);
		for (Gatos g: gatitos)
			System.out.println(g.getNombre());
    }
    
}
