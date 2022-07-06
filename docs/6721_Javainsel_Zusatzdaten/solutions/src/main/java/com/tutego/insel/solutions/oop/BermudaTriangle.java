package com.tutego.insel.solutions.oop;

public class BermudaTriangle {

  public static void main( String[] args ) {
    java.awt.Polygon p = new java.awt.Polygon();

    p.addPoint( 20, 60 );
    p.addPoint( 50, 20 );
    p.addPoint( 80, 60 );

    System.out.println( p.contains( 51, 25 ) );

    for ( int y = 0; y < 100; y++ ) {
      for ( int x = 0; x < 100; x++ )
        System.out.print( p.contains( x, y ) ? "#" : " " );
      System.out.println();
    }
  }
}