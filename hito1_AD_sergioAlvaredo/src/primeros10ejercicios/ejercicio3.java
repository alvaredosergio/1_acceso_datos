package primeros10ejercicios;

public class ejercicio3 {
    public static void main(String[] args) {
        factorial(10);
    }
    public static void factorial(int n){
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
