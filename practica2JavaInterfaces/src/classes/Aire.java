package classes;

import java.util.Date;

public class Aire extends Congelado {
    public double pcNitrogeno;
    public double pcOxigeno;
    public double pcDioxidoCarbono;
    public double pcVaporAgua;

    public double getPcNitrogeno() {
        return pcNitrogeno;
    }
    public void setPcNitrogeno(double pcNitrogeno) {
        this.pcNitrogeno = pcNitrogeno;
    }
    public double getPcOxigeno() {
        return pcOxigeno;
    }
    public void setPcOxigeno(double pcOxigeno) {
        this.pcOxigeno = pcOxigeno;
    }
    public double getPcDioxidoCarbono() {
        return pcDioxidoCarbono;
    }
    public void setPcDioxidoCarbono(double pcDioxidoCarbono) {
        this.pcDioxidoCarbono = pcDioxidoCarbono;
    }
    public double getPcVaporAgua() {
        return pcVaporAgua;
    }
    public void setPcVaporAgua(double pcVaporAgua) {
        this.pcVaporAgua = pcVaporAgua;
    }
    
    @Override
    public String toString() {
        return "Aire [pcDioxidoCarbono=" + pcDioxidoCarbono + ", pcNitrogeno=" + pcNitrogeno + ", pcOxigeno="
                + pcOxigeno + ", pcVaporAgua=" + pcVaporAgua + "]";
    }
    public Aire(String nombre, Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen,
            int temperatura, double pcNitrogeno, double pcOxigeno, double pcDioxidoCarbono, double pcVaporAgua) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperatura);
        this.pcNitrogeno = pcNitrogeno;
        this.pcOxigeno = pcOxigeno;
        this.pcDioxidoCarbono = pcDioxidoCarbono;
        this.pcVaporAgua = pcVaporAgua;
    }
    
    

    
}


