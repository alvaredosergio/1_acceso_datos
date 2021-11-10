package dia181021;

public class Cancion {
    private String nombre;
    private String cantante;

    public Cancion(String nombre, String cantante) {
        this.nombre = nombre;
        this.cantante = cantante;
    }

    public String getCancion() {
        return nombre;
    }

    public void setCancion(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    
}
