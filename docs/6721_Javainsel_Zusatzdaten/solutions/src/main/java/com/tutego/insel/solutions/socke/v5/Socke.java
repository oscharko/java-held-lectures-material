package com.tutego.insel.solutions.socke.v5;

public class Socke extends Kleidung {

  Socke( String farbe ) {
    super( farbe );
  }

  Socke() {
    this( "schwarz" );
  }

  @Override
  public void trockne() {
    super.trockne();

    System.out.println( "Bin eine Socke und gleich trocken." );
  }

  @Override
  public String toString() {
    return "Die Socke hat die Farbe " + getFarbe() + "und ist "
           + (istTrocken() ? "trocken" : "nass") + ".";
  }
}
