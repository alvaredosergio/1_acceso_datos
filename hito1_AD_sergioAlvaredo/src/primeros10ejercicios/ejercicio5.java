package primeros10ejercicios;

public class ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {5,16,20,8,6,9,11,15};
        maxInt(numeros);
    }
    public static void maxInt(int array[]){
        int nMax = 0;
        for (int n : array) {
            if(n >= nMax){
                nMax = n;
            }
        }
        System.out.println(nMax);
    }
}
