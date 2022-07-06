package com.tutego.insel.solutions.socke.v4;

public class Socke {

  private String farbe;
  private boolean istTrocken;

  public Socke() {
    this( "schwarz" );
  }

  public Socke( String farbe ) {
    this.farbe = farbe;
  }

  public void trockne() {
    istTrocken = true;
  }

  public void wasche() {
    istTrocken = false;
  }

  public boolean istTrocken() {
    return istTrocken;
  }

  public void setFarbe( String farbe ) {
    this.farbe = farbe;
  }

  public String getFarbe() {
    return farbe;
  }
  

  @Override
  public String toString() {
    return "Die Socke hat die Farbe " + getFarbe() + "und ist " + (istTrocken ? "trocken" : "nass")
           + ".";
  }
}