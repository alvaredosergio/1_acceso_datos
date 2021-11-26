package com.lm2a.caballero;

import java.io.PrintStream;

public class AventuraRescateDamisela implements IAventura {

	private PrintStream stream;
	
	public AventuraRescateDamisela(PrintStream stream) {
		super();
		this.stream = stream;
	}

	public void embarcar() {
		stream.println("Embarcando en la aventura de rescatar una damisela en apuros.");
		
	}

}
