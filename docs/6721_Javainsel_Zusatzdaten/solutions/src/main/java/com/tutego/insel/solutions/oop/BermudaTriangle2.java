package com.tutego.insel.solutions.oop;

import java.awt.Polygon;
import java.util.Random;

public class BermudaTriangle2 {

  static Polygon createRandomTriangle() {
    return setRandomTriangle( new Polygon() );
  }

  static Polygon setRandomTriangle( Polygon poly ) {
    poly.reset();

    Random random = new Random();
    poly.addPoint( random.nextInt( 100 ), random.nextInt( 100 ) );
    poly.addPoint( random.nextInt( 100 ), random.nextInt( 100 ) );
    poly.addPoint( random.nextInt( 100 ), random.nextInt( 100 ) );
    
    return poly;
  }

  public static void main( String[] args ) {
//    Polygon polygon = setRandomTriangle( new Polygon() );
    Polygon polygon = createRandomTriangle();

    for ( int y = 0; y < 100; y++ ) {
      for ( int x = 0; x < 100; x++ )
        System.out.print( polygon.contains( x, y ) ? "#" : " " );
      System.out.println();
    }
  }
}