package lambda;

public class UsaFunctionalInterface {
    public static void main(String[] args) {

        // Así se ve una interfaz funcional implementada, como una función Lambda.
        // El objetivo de una interfaz funcional, es poder utilizar su método de la fomra que nos sea necesaria, sin tener que modificar la interfaz.

        IFuntionalInterface fi = (x,y) -> x + "/" + y;
        System.out.println(fi.concatenador("hola", "mundo")); 
    }
}
