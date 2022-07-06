package com.tutego.insel.solutions.lang;

public class Checkerboard {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    System.out.println( "Bitte Schachbrettbreite eingeben:" );
    int width = new java.util.Scanner( System.in ).nextInt();

    System.out.println( "Bitte Schachbretthöhe eingeben:" );
    int height = new java.util.Scanner( System.in ).nextInt();

    for ( int y = 0; y < height; y++ ) {
      for ( int x = 0; x < width; x++ ) {
        if ( (x + y) % 2 == 1 )
          System.out.print( '#' );
        else
          System.out.print( ' ' );
      }
      System.out.println();
    }

    // Alternative mit Array für die Zeichen
    char[] chars = {' ', '#'};
    for ( int y = 0; y < height; y++ ) {
      for ( int x = 0; x < width; x++ )
        System.out.print( chars[ (x + y) % 2 ] );
      System.out.println();
    }
  }
}