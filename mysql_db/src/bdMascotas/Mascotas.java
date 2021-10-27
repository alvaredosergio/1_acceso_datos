package bdMascotas;

public class Mascotas {
	int id;
	String nombre;
	String raza;
	String anio;
	int codHistorial;
	HistoriaClinica hc;
	
	public Mascotas(int id,String nombre, String raza, String anio, int codHistorial/*, HistoriaClinica hc*/) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.anio = anio;
		this.codHistorial = codHistorial;
		//this.hc = hc;
	}
	
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
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public int getCodHistorial() {
		return codHistorial;
	}
	public void setCodHistorial(int codHistorial) {
		this.codHistorial = codHistorial;
	}
	public HistoriaClinica getHc() {
		return hc;
	}
	public void setHc(HistoriaClinica hc) {
		this.hc = hc;
	}

	@Override
	public String toString() {
		return "Mascotas [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", anio=" + anio + ", codHistorial="
				+ codHistorial + ", hc=" + hc + "]";
	}
}
