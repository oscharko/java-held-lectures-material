package com.tutego.insel.solutions.array;

import java.awt.Point;

public class Umdreher {

  public static void main( String[] args ) {
    Object[] points = {
      new Point( 1, 1 ), new Point( 2, 2 ), "new Point(5,5)", new Point( 7, 5 )
    };

    reverse( points );

    for ( int i = 0; i < points.length; i++ )
      System.out.println( points[ i ] );
  }

  public static void reverse( Object[] array ) {
    if ( array == null )
      return;

    int arrayLenHalf = array.length / 2;

    for ( int i = 0; i < arrayLenHalf; i++ ) {
      Object swap = array[ i ];
      array[ i ] = array[ array.length - i - 1 ];
      array[ array.length - i - 1 ] = swap;
    }
  }
}