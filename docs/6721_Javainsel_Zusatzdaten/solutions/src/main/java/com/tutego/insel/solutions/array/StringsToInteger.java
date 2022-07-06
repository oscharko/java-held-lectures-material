package com.tutego.insel.solutions.array;

public class StringsToInteger {

  public static int[] parseInts( String... args ) {
    if ( args == null || args.length == 0 )
      throw new IllegalArgumentException( "Keine Werte in args oder args ist null" );

    int[] result = new int[ args.length ];

    for ( int i = 0; i < args.length; i++ ) {
//      try {
        result[ i ] = Integer.parseInt( args[ i ] );
//      }
//      catch ( NumberFormatException e ) {
//        result[ i ] = -1;
//      }
    }
    return result;
  }

  public static void main( String[] args ) {
    for ( int e : parseInts( "2", "55", "5" ) )
      System.out.println( e );
  }
}