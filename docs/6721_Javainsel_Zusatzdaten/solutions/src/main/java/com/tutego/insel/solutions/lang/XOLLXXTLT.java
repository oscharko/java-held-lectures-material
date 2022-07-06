package com.tutego.insel.solutions.lang;

public class XOLLXXTLT {
  
  public static void main( String[] args ) {

    for ( int l = 0; l < 10; ++l ) {
      for ( int o = 0; o < 10; ++o ) {
        for ( int x = 0; x < 10; ++x ) {
          for ( int t = 0; t < 10; ++t ) {
            int xol = 100 * x + 10 * o + l;
            int lxx = 100 * l + 10 * x + x;
            int tlt = 100 * t + 10 * l + t;

            if ( (xol + lxx) == tlt ) {
              if ( (l != o) && (l != x) && (l != t) && (o != x) && (o != t) && (x != t) )
                System.out.println( "Ungleiche Variablen:" );

              System.out.println(
                "l = " + l + ", " +
                "o = " + o + ", " +
                "x = " + x + ", " +
                "t = " + t
              );
            }
          }
        }
      }
    }
  }
}