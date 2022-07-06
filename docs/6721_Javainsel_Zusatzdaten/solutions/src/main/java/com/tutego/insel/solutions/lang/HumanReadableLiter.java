package com.tutego.insel.solutions.lang;

public class HumanReadableLiter {

  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    System.out.println( "Bitte Menge in Liter angeben" );
    double value = new java.util.Scanner( System.in ).nextDouble();

    if ( value >= 1 ) {
      System.out.printf( "ca. %d l", (int) value );
    }
    else if ( value >= 0.1 ) {
      System.out.printf( "ca. %d cl", (int) (value * 10) );
    }
    else if ( value >= 0.001 ) {
      System.out.printf( "ca. %d ml", (int) (value * 1000) );
    }
    else {
      System.err.println( "Wert zu klein zur Darstellung" );
    }
  }
}