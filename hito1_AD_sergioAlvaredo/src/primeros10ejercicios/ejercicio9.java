package primeros10ejercicios;

public class ejercicio9 {
    public static void main(String[] args) {
        String palabras1 [] = {"hola","adios","uno"};
        segundoMax(palabras1);
    }
    public static void segundoMax(String array[]){
        String larga = "";
        String segundaLarga = "";
        for (String s : array) {
            if(s.length() > larga.length()){
                larga = s;
            }
        }
        for (String s : array) {
            if(s.length() == (larga.length()-1)){
                segundaLarga = s;
            }
        }
        System.out.println(segundaLarga);
    }
}
