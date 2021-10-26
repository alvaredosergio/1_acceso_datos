package ejercicioUML;

public class Oficial extends Tecnico {
    public String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oficial: [Categoria = " + this.categoria + ", Código de taller: " + this.codigoTaller + "]";
    }

    public Oficial(String nombre, String codigoTaller, String categoria) {
        super(nombre, codigoTaller);
        this.categoria = categoria;
    }

}
