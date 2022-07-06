package com.tutego.insel.solutions.lang;

public class Linie {

  public static void linie( int len, char c ) {
    while ( len-- > 0 )
      System.out.print( c );
  }

  public static void linie( int len ) {
    linie( len, '-' );
  }

  public static void linie( int len, String s ) {
    int noOfFullStrings = len / s.length();

    String remainString = s.substring( 0, len % s.length() );

    while ( noOfFullStrings-- > 0 )
      System.out.print( s );

    System.out.println( remainString );
  }

  public static void main( String[] args ) {
    linie( 4, '*' );
  }
}