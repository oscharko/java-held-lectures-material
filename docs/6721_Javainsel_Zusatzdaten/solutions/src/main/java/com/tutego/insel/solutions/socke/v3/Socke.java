package com.tutego.insel.solutions.socke.v3;

public class Socke {

  private String farbe;
  private boolean istTrocken;

  @Override
  public String toString() {
    return "Die Socke hat die Farbe " + getFarbe() + "und ist " + (istTrocken ? "trocken" : "nass")
           + ".";
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
}
