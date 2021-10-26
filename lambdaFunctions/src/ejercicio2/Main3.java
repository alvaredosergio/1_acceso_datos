package ejercicio2;

public class Main3 {
    public static void main(String[] args) {
        medirString("Hola");

        iVerificar vr = (palabra) -> palabra.length() <= 5 ? true : false;
        System.out.println(vr.verificar("Esternocleidomastoideo"));
    }

    public static void medirString(String palabra){
        if(palabra.length() >= 5){
            System.out.println("La palabra mide 5 o mas caracteres.");
        }
        else{
            System.out.println("La palabra mide menos de 5 caracteres.");
        }
    }
    
}
