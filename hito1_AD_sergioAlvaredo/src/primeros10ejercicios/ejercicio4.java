package primeros10ejercicios;

public class ejercicio4 {
    public static void main(String[] args) {
        invertirString("Hola que tal");
    }
    public static void invertirString(String s){
        String stringInvertido = "";
        for (int i = s.length()-1; i >= 0; i--) {
            stringInvertido = stringInvertido + s.charAt(i);
        }
        System.out.println(stringInvertido);
    }
}
