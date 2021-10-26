package dia181021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaApiStreams {
    public static void main(String[] args) {
        List<Cancion> canciones = new ArrayList<>(Arrays.asList(
		new Cancion("Te Equivocas", "Jon Carlo"),
		new Cancion("Solo tu", "Orlando Elizalde"),
		new Cancion("La Mano de Dios","Jon Carlo"),
		new Cancion("Como una hoja de papel", "Evelyn Vasquez"),
		new Cancion("Siempre te amare", "Darwin Lechler"),
		new Cancion("Brilla", "Darwin Lechler"),
		new Cancion("Sin amor", "Carlos & Carito"),
		new Cancion("Te amare", "Joan Sánchez"),
		new Cancion("Cuanto me ama", "Orlando Elizalde")
	    ));

        PruebaApiStreams pai = new PruebaApiStreams();

        /*//Anterior a java 8
        for(Cancion cancion : canciones){
            System.out.println("Java 7: "+cancion);
        }
        
        //Uso de lambdas en Java 8
        canciones.forEach( c -> System.out.println("Java 8: "+ c));*/
    }

    public List<Cancion> filtrarCantanteJava8Map(List<Cancion> canciones,String cantante){
        return canciones.stream()
        .filter(c -> c.getCantante().equals(cantante))
        .map( c -> {
                c.setCantante(c.getCantante().toUpperCase());
                return c;
            }
        )
        .collect(Collectors.toList());
    } 
}
