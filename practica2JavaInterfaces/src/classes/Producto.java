package classes;

import java.util.Date;

public class Producto {
    public String nombre;
    public Date fechaCaducidad;
    public int numeroLote;

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroLote() {
        return numeroLote;
    }
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
    }
    
    public Producto(String nombre, Date fechaCaducidad, int numeroLote) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    

    
}


