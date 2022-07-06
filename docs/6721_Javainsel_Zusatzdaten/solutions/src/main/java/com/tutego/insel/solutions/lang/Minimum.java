package com.tutego.insel.solutions.lang;

public class Minimum {

  public static void main( String[] args ) {
    long a = 2;
    long b = 3567;
    long c = 21;

    System.out.println( "Minimum: " + Math.min( Math.min( a, b ), c ) );
    System.out.println( "Minimum: " + min( a, b, c ) );
  }

  // alternative Lösung in einer Methode

  private static long min( long a, long b, long c ) {
    return (a < b) ? Math.min( a, c ) : Math.min( b, c );
  }
}
