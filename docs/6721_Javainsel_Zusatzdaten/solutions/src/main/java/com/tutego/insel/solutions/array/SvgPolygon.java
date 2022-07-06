package com.tutego.insel.solutions.array;

public class SvgPolygon {

  public static void main( String[] args ) {

    final int LENGTH = 5;
    long[] x = new long[LENGTH];
    long[] y = new long[LENGTH];

    for ( int i = 0; i < x.length; i++ ) {
      x[ i ] = Math.round( Math.random() * 490 + 10 );
      y[ i ] = Math.round( Math.random() * 490 + 10 );
    }

  //    for ( int i = 0; i < x.length; i++ )
  //    System.out.printf( "(%.0d,%.0d)%s",
  //                       x[i], y[i],
  //                       i != x.length - 1 ? ", " : "" ) ;

    System.out.println( "<svg height=\"500\" width=\"500\"><polygon points=\"" );

    for ( int i = 0; i < x.length; i++ )
      System.out.printf( "%d,%d ", x[ i ], y[ i ] );

    System.out.println( "\" /></svg>" );
  }
}
