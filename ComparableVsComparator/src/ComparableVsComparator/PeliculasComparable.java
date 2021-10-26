package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
 
class PeliculasComparable implements Comparable<PeliculasComparable>
{
    private double puntuacion;
    private String nombre;
    private int año;
 
    // Ordenar peliculas por año
    public int compareTo(PeliculasComparable m)
    {
        return this.año - m.año;
    }
 
    // Constructor
    public PeliculasComparable(String nm, double rt, int yr)
    {
        this.nombre = nm;
        this.puntuacion = rt;
        this.año = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return puntuacion; }
    public String getName()   {  return nombre; }
    public int getYear()      {  return año;  }
}
 
// Driver class
class Main
{
    public static void main(String[] args)
    {
        ArrayList<PeliculasComparable> list = new ArrayList<PeliculasComparable>();
        list.add(new PeliculasComparable("Force Awakens", 8.3, 2015));
        list.add(new PeliculasComparable("Star Wars", 8.7, 1977));
        list.add(new PeliculasComparable("Empire Strikes Back", 8.8, 1980));
        list.add(new PeliculasComparable("Return of the Jedi", 8.4, 1983));
 
        Collections.sort(list);
 
        System.out.println("Peliculas despues de ordenar: ");
        for (PeliculasComparable movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
    }
}
