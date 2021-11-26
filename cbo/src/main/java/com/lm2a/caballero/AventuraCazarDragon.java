package com.lm2a.caballero;

import java.io.PrintStream;

public class AventuraCazarDragon implements IAventura {

  private PrintStream stream;

  public AventuraCazarDragon(PrintStream stream) {
    this.stream = stream;
  }

  public void embarcar() {
    stream.println("Embarcando en la aventura de cazar un dragon!");
  }

}
