package pred;

import java.util.function.Predicate;

public class UsaIMedida {
    public static void main(String[] args) {

        // Este ejemplo es utilizando una interfaz funcional creada por nosotros mismos.
        IMedida medida = x -> x.length() >= 5;
        if(medida.medir("Mañana")){
            System.out.println("Es mayor o igual de 5 caracteres.");
        }else {
            System.out.println("Es menor de 5 caracteres.");
        }


        // Este ejemplo es utilizando una interfaz funcional PREECREADA por Java. Nos ahorra tener que crear nuestra propia interfaz IMedida.java
        Predicate<String> esLarga = p -> p.length() >= 5;
        if(esLarga.test("Mañana")){
            System.out.println("Es mayor o igual de 5 caracteres.");
        }else {
            System.out.println("Es menor de 5 caracteres.");
        }
    }
}
