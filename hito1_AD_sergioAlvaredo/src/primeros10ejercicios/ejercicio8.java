package primeros10ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio8 {
    public static void main(String[] args) {
        List <String> palabras = new ArrayList<String>();
        palabras.add("Sergio");
        palabras.add("es");
        palabras.add("malisimo");
        palabras.add("programando");
        System.out.println(listToUpperCase(palabras));
    }
    public static List<String> listToUpperCase(List<String> array){
        List<String> lista = array.stream()
         .map(x->x.toUpperCase())
         .collect(Collectors.toList());
         return lista;
     }
}
