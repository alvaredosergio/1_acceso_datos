package lambda.ejercicio1;

public class Empleado {
    public int id;
    public String nombre;
    public int nomina;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNomina() {
        return nomina;
    }
    public void setNomina(int nomina) {
        this.nomina = nomina;
    }

    public Empleado(int id, String nombre, int nomina) {
        this.id = id;
        this.nombre = nombre;
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", nomina=" + nomina + "]";
    } 
}

