package com.tutego.insel.solutions.oop;

import java.awt.*;

public class NullPunkte {

  public static void main( String[] args ) {
    Point[] arrp = new Point[10];
    arrp[ 5 ] = new Point( 100, 150 );
    arrp[ 6 ] = new Point( 100, 150 );

    System.out.println( anzahl( arrp ) );
  }

  public static int anzahl( Point[] arrayofpoint ) {
    int count = 0;

    for ( int i = 0; i < arrayofpoint.length; i++ ) {
      Point p = arrayofpoint[ i ];

      if ( p != null )
        if ( p.x != 0 && p.y != 0 )
          count++;
    }
    return count;
  }
}
