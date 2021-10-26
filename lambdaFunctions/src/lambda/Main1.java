package lambda;

public class Main1 {
    public static void main(String[] args) {
        IPrinter imprime = System.out::println;
        imprime.printer("Esta es una implementacion de una interfaz funcional.");

    }
}
