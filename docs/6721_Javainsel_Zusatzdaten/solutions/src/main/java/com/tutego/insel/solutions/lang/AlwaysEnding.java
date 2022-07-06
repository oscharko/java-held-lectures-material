package com.tutego.insel.solutions.lang;

public class AlwaysEnding {

  public static void main( String[] args ) {

    double t = Math.random() * 10;

    while ( t != 0 ) {
      System.out.println( t );
      if ( t < 1 )
        t *= 2;
      if ( t >= 1 )
        t--;
    }
  }
}
