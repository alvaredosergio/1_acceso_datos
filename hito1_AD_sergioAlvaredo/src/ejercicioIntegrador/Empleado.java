package ejercicioIntegrador;

import java.util.List;

public class Empleado {
    private String nombre;
    private String email;
    private int categoria;
    private List <Jornales> listaJornales;
    
    public Empleado(String nombre, String email, int categoria, List<Jornales> listaJornales) {
        this.nombre = nombre;
        this.email = email;
        this.categoria = categoria;
        this.listaJornales = listaJornales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public List<Jornales> getListaJornales() {
        return listaJornales;
    }

    public void setListaJornales(List<Jornales> listaJornales) {
        this.listaJornales = listaJornales;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", email=" + email + ", listaJornales=" + listaJornales
                + ", categoria=" + categoria + "]";
    }
}
