package classes;

import java.util.Date;

public class Agua extends Congelado {
    public double sal;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Agua [sal=" + sal + "]";
    }

    public Agua(String nombre, Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen,
            int temperatura, double sal) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperatura);
        this.sal = sal;
    }

    

    
}


