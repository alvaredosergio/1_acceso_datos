package ejercicioUML;

public class Tecnico extends Empleado {
    public String codigoTaller;

    public String getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(String codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return "Tecnico: [codigoTaller = " + this.codigoTaller + "]";
    }

    public Tecnico(String nombre, String codigoTaller) {
        super(nombre);
        this.codigoTaller = codigoTaller;
    }
}
