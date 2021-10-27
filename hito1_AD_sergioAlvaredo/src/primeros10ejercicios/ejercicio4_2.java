package primeros10ejercicios;
import java.util.Random;

public class ejercicio4_2 {
    public static void main(String[] args) {
        numAzar2nums(10,15);
    }
    public static void numAzar2nums(int n1, int n2){
        Random rnd = new Random();
        int e = rnd.nextInt(n2-n1+1)+n1;
        System.out.println(e);
}
}
