package ejercicioUML;

public class Operario extends Tecnico {
    public String maquina;

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Operario: [Maquina = " + this.maquina + ", Código de taller: " + this.codigoTaller + "]";
    }

    public Operario(String nombre, String codigoTaller, String maquina) {
        super(nombre, codigoTaller);
        this.maquina = maquina;
    }
}
