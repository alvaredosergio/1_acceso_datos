package dia181021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba {
    public static void main(String[] args) {
        List<Cancion> canciones = new ArrayList<Cancion>(Arrays.asList(
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

        filtrarCantante(canciones);
    }

    public static void filtrarCantante(List<Cancion> canciones){
        canciones.stream()
        .filter(x -> x.getCantante().equals("Jon Carlo"))
        .forEach(y -> System.out.println("Cantante: " + y.getCantante() + "\nCancion: " + y.getCancion()));
    } 
}
