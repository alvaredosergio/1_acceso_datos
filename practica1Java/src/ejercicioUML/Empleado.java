package ejercicioUML;

public class Empleado {
    public String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Empleado: [nombre = " + nombre + "]";
    }
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public float salario(int horas, float valor){
        return horas * valor;
    }
}
