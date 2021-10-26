package classes;

import java.util.Date;

public class Nitrogeno extends Congelado {
    public String metodoCongelacion;
    public int tiempoExposicionNitrogeno;

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }
    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }
    public int getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }
    public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }
    
    @Override
    public String toString() {
        return "Nitrogeno [metodoCongelacion=" + metodoCongelacion + ", tiempoExposicionNitrogeno="
                + tiempoExposicionNitrogeno + "]";
    }
    public Nitrogeno(String nombre, Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen,
            int temperatura, String metodoCongelacion, int tiempoExposicionNitrogeno) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperatura);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    

    
}


