package restaurantes;

public class Empleado {
    String nombre;
    Restaurantes restaurante;
    
    public Empleado(String nombre, Restaurantes restaurante) {
        this.nombre = nombre;
        this.restaurante = restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Restaurantes getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurantes restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Empleado [nombre: " + nombre + ", restaurante: " + restaurante + "]";
    }

    
}
