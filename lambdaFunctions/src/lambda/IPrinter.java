package lambda;

// Una interfaz funcional solo puede tener un método.
@FunctionalInterface
public interface IPrinter {
    public void printer(String x);
    
    public default void decirHola(){
        System.out.println("HOLA");
    }
}
