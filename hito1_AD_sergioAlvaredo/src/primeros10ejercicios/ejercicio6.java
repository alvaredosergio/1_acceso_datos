package primeros10ejercicios;

public class ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {5,5,6};
        media(numeros);
    }
    public static void media(int array[]){
        double suma = 0;
        for (int n : array) {
            suma += n;
        }
        double media = suma/array.length;
        System.out.println(media);
    }
}
