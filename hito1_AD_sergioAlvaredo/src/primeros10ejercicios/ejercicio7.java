package primeros10ejercicios;
import java.util.Arrays;

public class ejercicio7 {
    public static void main(String[] args) {
        int numeros [] = {1,8,4,5,5,9};
        mediaStream(numeros);
    }

    public static void mediaStream(int array[]){
        System.out.println(Arrays.stream(array).average());
    }

}
