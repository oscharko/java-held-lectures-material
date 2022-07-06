package com.tutego.insel.solutions.lang;

public class ABCZ {

  static String abcz() {
    String s = "";

    for ( char c = 'A'; c <= 'Z'; c++ )
      s += c;

    return s;
  }

  static String abcz2() {
    StringBuilder sb = new StringBuilder();

    for ( char c = 'A'; c <= 'Z'; c++ )
      sb.append( c );

    return sb.toString();
  }

  static String abcz( char anf, char end ) {
    String s = "";

    for ( char c = anf; c <= end; c++ )
      s += c;

    return s;
  }

  public static void main( String[] args ) {
    System.out.println( abcz() );
  }
}
