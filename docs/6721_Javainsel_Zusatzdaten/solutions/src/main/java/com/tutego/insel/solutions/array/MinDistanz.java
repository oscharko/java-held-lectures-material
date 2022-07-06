package com.tutego.insel.solutions.array;

import java.awt.*;

public class MinDistanz {

  static double dist( Point p ) {
    return Math.sqrt( p.x * p.x + p.y * p.y );
  }

  static double minDist( Point[] points, int size ) {
    double minimum = dist( points[ 0 ] );

    for ( int i = 1; i < size; i++ )
      if ( dist( points[ i ] ) < minimum )
        minimum = dist( points[ i ] );

    return minimum;
  }

  static Point minDistPoint( Point punkte[], int anz ) {
    double minimum = dist( punkte[ 0 ] );
    int minpos = 0;

    for ( int i = 1; i < anz; i++ ) {
      if ( dist( punkte[ i ] ) < minimum ) {
        minimum = dist( punkte[ i ] );
        minpos = i;
      }
    }
    return punkte[ minpos ];
  }

  public static void main( String[] args ) {
    Point[] punktFeld = {
        new Point( 10, 20 ), new Point( 12, 2 ), new Point( 44, 4 )
    };

    System.out.println( minDist( punktFeld, 3 ) );

    System.out.println( minDistPoint( punktFeld, 3 ) );
  }
}