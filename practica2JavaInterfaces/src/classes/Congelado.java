package classes;

import java.util.Date;

public class Congelado extends Producto {
    public Date fechaEnvasado;
    public String paisOrigen;
    public int temperatura;

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Congelado [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + ", temperatura="
                + temperatura + "]";
    }
    public Congelado(String nombre, Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen,
            int temperatura) {
        super(nombre, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperatura = temperatura;
    }
    
    

    
    
}


