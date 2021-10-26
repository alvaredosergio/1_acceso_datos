package classes;

import java.util.Date;

public class Refrigerado extends Producto {
    public Date fechaEnvasado;
    public String paisOrigen;
    public int temperatura;
    public int codigoOrganismo;

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
    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }
    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public String toString() {
        return "Refrigerado [codigoOrganismo=" + codigoOrganismo + ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen="
                + paisOrigen + ", temperatura=" + temperatura + "]";
    }
    public Refrigerado(String nombre, Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen,
            int temperatura, int codigoOrganismo) {
        super(nombre, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperatura = temperatura;
        this.codigoOrganismo = codigoOrganismo;
    }

    

    
    
}


