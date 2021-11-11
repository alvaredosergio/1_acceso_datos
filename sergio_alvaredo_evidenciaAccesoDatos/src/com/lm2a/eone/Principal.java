package com.lm2a.eone;

public class Principal extends AbstractInMemoryPeliService {
    
    public static void main(String[] args) {
        Principal p = new Principal();

        // Peliculas con año menor a 2009
        /*Peli peliConImdb = p.peliculaCuyoIMDBSeaEste("tt1019452");
        System.out.println(peliConImdb.getTitulo());*/

        // Peliculas con año menor a 2009
        /*for (Peli pel : p.peliculasConAnioMenorA2009()) {
            System.out.println(pel.getTitulo());
        }*/

        // Peliculas que empiezan por A
        /*for (Peli pel : p.peliculasQueEmpiezanConA()) {
            System.out.println(pel.getTitulo());
        }*/
    }
}
