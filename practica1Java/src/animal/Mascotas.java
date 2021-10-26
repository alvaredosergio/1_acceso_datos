package animal;

public class Mascotas extends Animales {
    public String nombre;
    public String propietario;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public Mascotas(String nombre) {
        this.nombre = nombre;
    }


}
