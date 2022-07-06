package com.tutego.insel.solutions.lang;

public class PrintUnderline {

  public static void main( String[] args ) {
    System.out.println( args[ 0 ] );

    underline( args[ 0 ], args[ 1 ] );
  }

  static void underline( String text, String searchWord ) {
    int i = 0;
    int last = 0;

    while ( i >= 0 ) {
      i = text.indexOf( searchWord, i );

      if ( i < 0 )
        break;

      outputChar( i, last, ' ' );
      outputChar( searchWord.length(), 0, '+' );
      last = i + searchWord.length();

      i++;
    }
  }

  static void outputChar( int i, int last, char c ) {
    for ( int j = last; j < i; j++ )
      System.out.print( c );
  }
}
