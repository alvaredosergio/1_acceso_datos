package com.lm2a.caballero;

public class CaballeroRescatadorDamiselas implements ICaballero {

	private AventuraRescateDamisela aventura;

	public CaballeroRescatadorDamiselas() {
		this.aventura = new AventuraRescateDamisela(null);
	}

	public void embarkOnQuest() {
		aventura.embarcar();
	}

	public void embarcarseEnAventura() {
		aventura.embarcar();
	}

}