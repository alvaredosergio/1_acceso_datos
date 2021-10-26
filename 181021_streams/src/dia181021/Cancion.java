package dia181021;

public class Cancion {
    private String cancion;
    private String cantante;

    public Cancion(String cancion, String cantante) {
        this.cancion = cancion;
        this.cantante = cantante;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    @Override
    public String toString() {
        return "Cancion [cancion=" + cancion + ", cantante=" + cantante + "]";
    }
    
}
