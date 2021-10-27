package primeros10ejercicios;

public class ejercicio2 {
    public static void main(String[] args) {
        multiplos3(12);
    }
    public static void multiplos3(int n){
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if(i%3 == 0){
                suma = suma+i;
            }
        }
        System.out.println(suma);
    }
}
