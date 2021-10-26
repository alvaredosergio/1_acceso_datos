package humano;

import animal.Mascotas;

public class Propietario extends Humano {
    public String correo;
    public Mascotas mascota;

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Mascotas getMascota() {
        return mascota;
    }
    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }  

}
