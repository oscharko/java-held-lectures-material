package com.tutego.insel.solutions.lang;

public class GeschachtelteSchleifen {

  public static void main( String[] args ) {
    // Normale Ausgabe

    for ( int i = 1; i <= 5; i++ ) {
      for ( int j = 1; j <= i; j++ )
        System.out.print( i );

      System.out.println();
    }
    System.out.println();

    // Zentrierte Ausgabe
    for ( int i = 1; i <= 5; i++ ) {
      for ( int k = 0; k < (5 - i); k++ )
        System.out.print( " " );

      for ( int j = 1; j <= i; j++ )
        System.out.print( i + " " );

      System.out.println();
    }
  }
}