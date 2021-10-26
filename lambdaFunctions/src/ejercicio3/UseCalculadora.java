package ejercicio3;

public class UseCalculadora {
    public static void main(String[] args) {
        ICalculadora sumar = (x,y) -> x + y;
        ICalculadora restar = (x,y) -> x - y;
        ICalculadora multiplicar = (x,y) -> x * y;
        ICalculadora dividir = (x,y) -> x / y;

        System.out.println(sumar.operacion(1,2));
        System.out.println(restar.operacion(5,7));
        System.out.println(multiplicar.operacion(6,6));
        System.out.println(dividir.operacion(34,9));
    }
}
