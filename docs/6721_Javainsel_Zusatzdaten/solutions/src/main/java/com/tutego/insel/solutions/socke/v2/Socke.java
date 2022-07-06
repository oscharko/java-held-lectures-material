package com.tutego.insel.solutions.socke.v2;

public class Socke {

  private String farbe;
  private boolean istTrocken;

  public Socke( String neueFarbe ) {
    this.farbe = neueFarbe;
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
