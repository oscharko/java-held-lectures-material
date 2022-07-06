package com.tutego.insel.solutions.socke.v5;

public class Waescheleine {

  private final int MAX = 10;
  private Kleidung[] kleidungsstuecke = new Kleidung[MAX];
  private int cnt;

  public void add( Kleidung k ) {
    if ( cnt < MAX )
      kleidungsstuecke[ cnt ] = k;

    cnt++;
  }

  public Kleidung get( int index ) {
    if ( index >= 0 && index < MAX )
      return kleidungsstuecke[ index ];

    System.err.println( "Index flasch!" );
    return null;
  }

  public int length() {
    return cnt;
  }
}