package primeros10ejercicios;
import java.util.Random;

public class ejercicio4_1 {
    public static void main(String[] args) {
        String[] nombres = {"sergio","jose","maria","paco","pepe"};
        nombreAzar(nombres);
    }
    public static void nombreAzar(String array[]){
        Random r = new Random();
        int e = r.nextInt(array.length);
        System.out.println(array[e]);
    }
}
