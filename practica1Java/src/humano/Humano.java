package humano;

public class Humano {
    public String nombre;
    public String genero;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void hablar(){
        System.out.println("hablando...");
    }

    public void comer(){
        System.out.println("comiendo...");
    }

    public void respirar(){
        System.out.println("respirando...");
    }

    public void caminar(){
        System.out.println("caminando...");
    }
}
