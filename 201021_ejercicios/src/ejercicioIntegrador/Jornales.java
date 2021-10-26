package ejercicioIntegrador;

public class Jornales {
    private int horasTrabajadas;
    private int diasTrabajados;
    
    public Jornales(int horasTrabajadas, int diasTrabajados) {
        this.horasTrabajadas = horasTrabajadas;
        this.diasTrabajados = diasTrabajados;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public String toString() {
        return "Jornales [diasTrabajados=" + diasTrabajados + ", horasTrabajadas=" + horasTrabajadas + "]";
    }

    
}
