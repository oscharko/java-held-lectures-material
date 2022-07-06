package com.tutego.insel.solutions.socke.v5;

import java.awt.Color;

public class Kleidung {

  private String farbe;
  private boolean istTrocken;

  Kleidung( String farbe ) {
    this.farbe = farbe;
  }

  Kleidung() {
    this( "schwarz" );
  }

  public static Color stringToColor( String s ) {
    String[] farbnamen = {
        "rot", "gruen", "blau", "gelb"
    };

    Color[] farbcolors = {
        Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW
    };

    for ( int i = 0; i < farbnamen.length; i++ )
      if ( farbnamen[ i ].equalsIgnoreCase( s ) )
        return farbcolors[ i ];

    return Color.BLACK;
  }

  public void setFarbe( String farbe ) {
    this.farbe = farbe;
  }

  public String getFarbe() {
    return farbe;
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
}