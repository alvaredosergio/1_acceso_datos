package com.lm2a.caballero;

public class ValienteCaballero implements ICaballero {

	private IAventura aventura;

	public ValienteCaballero(IAventura aventura) {
		this.aventura = aventura;
	}

	public void embarcarseEnAventura() {
		aventura.embarcar();

	}

}
