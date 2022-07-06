package com.tutego.insel.solutions.lang;

public class CollatzRekursiv {

  static long iterate( long val, long max ) {
    if ( val != 1 ) {
      if ( val % 2 == 0 )
        return iterate( val / 2, Math.max( val, max ) );
      return iterate( 3 * val + 1, Math.max( val, max ) );
    }
    return max;
  }

  public static void main( String[] args ) {
    System.out.println( iterate( 2001, 0 ) );
  }
}
