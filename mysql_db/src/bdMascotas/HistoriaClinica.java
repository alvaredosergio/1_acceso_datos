package bdMascotas;

public class HistoriaClinica {
	int id;
	String historial;
	
	public HistoriaClinica(int id, String historial) {
		super();
		this.id = id;
		this.historial = historial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return "HistoriaClinica [id=" + id + ", historial=" + historial + "]";
	}
}
