package ejercicioUML;

public class Directivo extends Empleado {
    public String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Directivo: [Area = " + this.area + "]";
    }

    public Directivo(String nombre, String area) {
        super(nombre);
        this.area = area;
    } 
}
