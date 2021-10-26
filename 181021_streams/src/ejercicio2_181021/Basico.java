package ejercicio2_181021;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase con ejercicios nivel básico
 * Created by aalopez on 18/08/15.
 */
public class Basico {

    /**
     * Convertir a mayúsculas cada una de las palabras recibidas como parámetro.
     * Trata de usar uno de los nuevos métodos adicionados a las listas en Java 8, verifica cual método permite
     * reemplazar los items de la lista por medio de una función.
     *
     * @param palabras Listado de palabras a convertir
     * @return Lista que contiene las palabras en mayúsculas
     */
    public static List<String> ejercicio1(List<String> palabras) {
        List <String> palabrasMayusculas = new ArrayList<String>();

        for (String pal : palabras) {
            String palMay = pal.toUpperCase();
            palabrasMayusculas.add(palMay);
        }

        for (String may : palabrasMayusculas) {
            System.out.println(may);
        }
        return palabrasMayusculas;
    }

    /**
     * Del listado de cadenas de texto eliminar las cadenas de ese listado cuyo tamaño sea inferior o igual a 10 caracteres.
     * Trata de usar uno de los nuevos métodos adicionados a las listas en Java 8
     *
     * @param listado cadenas de texto. Atención: Este listado es no modificable, por lo que una nueva lista de debe ser
     * creada a partir de este listado, por ejemplo: {@code List<String> nuevaLista = new ArrayList<>(listado);}
     * @return lista que contiene cadenas de texto cuyo tamaño de caracteres es superior a 10
     */
    public static List<String> ejercicio2(List<String> listado) {
        List <String> menor10 = new ArrayList<String>();

        for (String lis : listado) {
            if(lis.length() <= 18){
                menor10.add(lis);
            }
        }
        
        for (String menor : menor10) {
            System.out.println(menor);
        }
        return menor10;
    }


    /**
     * Del listado pasado como parámetro, une la tercera, cuarta y quinta cadena separadas por guión (-).
     * Usa la API Stream y sus métodos que permiten saltar y limitar el stream.
     *
     * @param listado cadenas de texto
     * @return Cadena de texto que se compone de la tercera, cuarta y quinta cadena de texto separadas por guiones
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public String ejercicio3(List<String> listado) {
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        alumnos.add("Permita que me arrepienta oh");
        alumnos.add("mi bella cenicienta,");
        alumnos.add("de rodillas mi presencia");
        alumnos.add("si mi ausencia fue tu afrenta.");
        alumnos.add("Que noches, que noches tan bonitas,");
        alumnos.add("Siloé en sus callesitas,");
        alumnos.add("al fondo mi valle en risa");
        alumnos.add("¡ay! todito se divisa.");
        alumnos.add("Un clásico en el Pascual,");
        alumnos.add("adornado de mujeres sin par,");
        alumnos.add("América y Cali a ganar,");
        alumnos.add("aquí no se puede empatar.");
        alumnos.add("Barranquilla, puerta de oro");
        alumnos.add("Paris la ciudad luz");
        alumnos.add("Nueva York capital del mundo");
        alumnos.add("y del cielo Cali, la sucursal");
        alumnos.add("A millas siento tu aroma,");
        alumnos.add("cualquiera justo razona,");
        alumnos.add("que Cali es Cali señoras, señores");
        alumnos.add("lo demás es loma.");

        ejercicio1(alumnos);
        System.out.println("_________________");

        ejercicio2(alumnos);
        System.out.println("_________________");
    }
}