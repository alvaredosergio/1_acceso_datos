package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import methods.Comparator1;

public class Muestra {
    public static void main(String[] args) {
        Refrigerado refrigerado1 = new Refrigerado("Yogur Griego",new Date(),47,new Date(),"Puerto Rico",17,4);
        Congelado congelado1 = new Congelado("Guisantes",new Date(),47,new Date(),"Puerto Rico",17);
        Aire aire1 = new Aire("Pescado Azul",new Date(),32,new Date(),"Francia",21,25,25,25,25);
        Agua agua1 = new Agua("Gambas",new Date(),67,new Date(),"Japón",19,3.4);
        Nitrogeno nitrogeno1 = new Nitrogeno("Pepinillos",new Date(),72,new Date(),"Finlandia",24,"Método criogénico",30);

        List <Producto> productos = new ArrayList <Producto>();

        productos.add(refrigerado1);
        productos.add(congelado1);
        productos.add(aire1);
        productos.add(agua1);
        productos.add(nitrogeno1);

        /*for(Producto prod:productos){
            System.out.println(prod.toString());
        }*/ 
        
        /*Ordenar por Nombre Alfabeticamente*/
        System.out.println("Productos ordenados por NOMBRE:");
        Comparator1 nameSort = new Comparator1();
		Collections.sort(productos, nameSort);
		for (Producto p: productos)
			System.out.println(p.getNombre());
    }
}
