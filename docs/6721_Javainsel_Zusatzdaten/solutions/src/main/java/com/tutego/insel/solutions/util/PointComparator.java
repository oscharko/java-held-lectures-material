package com.tutego.insel.solutions.util;

import java.util.*;
import java.awt.Point;

public class PointComparator implements Comparator<Point> {

  @Override
  public int compare( Point p1, Point p2 ) {
    double distP1 = p1.distanceSq( 0, 0 );
    double distP2 = p2.distanceSq( 0, 0 );

    if ( distP1 < distP1 )
      return -1;
    if ( distP1 > distP2 )
      return +1;
    return 0;
  }

  public static void main( String[] args ) {
    Point[] points = {
        new Point( 9, 3 ),
        new Point( 3, 4 ),
        new Point( 4, 3 ),
        new Point( 1, 2 ),
    };

    Arrays.sort( points, new PointComparator() );

    for ( Point point : points ) {
      System.out.println( point );
    }
  }
}