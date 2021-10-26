package primeros10ejercicios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Ejercicio 1
        System.out.println("Ejercicio 1: ");
        ejercicio1(5,5);
        System.out.println();

        // Ejercicio 2
        System.out.println("Ejercicio 2: ");
        ejercicio2(12);
        System.out.println();

        // Ejercicio 3
        System.out.println("Ejercicio 3: ");
        ejercicio3(10);
        System.out.println();

        // Ejercicio 4
        System.out.println("Ejercicio 4: ");
        ejercicio4("Hola que tal");
        System.out.println();

        // Ejercicio 4.1
        System.out.println("Ejercicio 4.1: ");
        String[] nombres = {"sergio","jose","maria","paco","pepe"};
        ejercicio4_1(nombres);
        System.out.println();

        // Ejercicio 4.2
        System.out.println("Ejercicio 4.2: ");
        ejercicio4_2(10,20);
        System.out.println();

        // Ejercicio 5
        System.out.println("Ejercicio 5: ");
        int[] numeros = {5,16,20,8,6,9,11,15};
        ejercicio5(numeros);
        System.out.println();

        // Ejercicio 6 
        System.out.println("Ejercicio 6: ");
        int[] numeros2 = {5,5,6};
        ejercicio6(numeros2);

        // Ejercicio 7 
        System.out.println("Ejercicio 7: ");

        // Ejercicio 8 
        System.out.println("Ejercicio 8: ");
        List <String> palabras = new ArrayList<String>();
        palabras.add("Sergio");
        palabras.add("es");
        palabras.add("malisimo");
        palabras.add("programando");
        System.out.println(ejercicio8(palabras));

        // Ejercicio 9 
        System.out.println("Ejercicio 9: ");
        String palabras1 [] = {"hola","adios","uno","glkhdlfkashf"};
        ejercicio9(palabras1);
    }

    public static void ejercicio1 (double n1, double n2){
        double suma = n1 + n2;
        System.out.println("La suma de " + n1 + " + " + n2 + " = " + suma);
    }

    public static void ejercicio2(int n){
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if(i%3 == 0){
                suma = suma+i;
            }
        }
        System.out.println(suma);
    }

    public static void ejercicio3(int n){
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void ejercicio4(String s){
        String stringInvertido = "";
        for (int i = s.length()-1; i >= 0; i--) {
            stringInvertido = stringInvertido + s.charAt(i);
        }
        System.out.println(stringInvertido);
    }

    public static void ejercicio4_1(String array[]){
        Random r = new Random();
        int e = r.nextInt(array.length);
        System.out.println(array[e]);
    }

    public static void ejercicio4_2(int n1, int n2){
            Random rnd = new Random();
            int e = rnd.nextInt(n2-n1+1)+n1;
            System.out.println(e);
    }

    public static void ejercicio5(int array[]){
        int nMax = 0;
        for (int n : array) {
            if(n >= nMax){
                nMax = n;
            }
        }
        System.out.println(nMax);
    }

    public static void ejercicio6(int array[]){
        double suma = 0;
        for (int n : array) {
            suma += n;
        }
        double media = suma/array.length;
        System.out.println(media);
    }

    /*public static void ejercicio7(int array[]){
        Arrays.stream(array)
        .average();
    }*/

    public static List<String> ejercicio8(List<String> array){
       List<String> lista = array.stream()
        .map(x->x.toUpperCase())
        .collect(Collectors.toList());
        return lista;
    }

    public static void ejercicio9(String array[]){
        String larga = "";
        String segundaLarga = "";
        for (String s : array) {
            if(s.length() > larga.length()){
                larga = s;
            }
        }
        for (String s : array) {
            if(s.length() == (larga.length()-1)){
                segundaLarga = s;
            }
        }

        System.out.println(segundaLarga);
    }
}
