package com.tutego.insel.solutions.lang;

public class SVGChessboard {
  public static void startSVG() {
    System.out.println( "<svg width=\"400\" height=\"110\">" );
  }

  public static void endSVG() {
    System.out.println( "</svg>" );
  }

  public static void printChessboard( int size ) {
    for ( int x = 0; x < size; x++ ) {
      for ( int y = 0; y < size; y++ ) {
        String color = ((x % 2) ^ (y % 2)) == 0 ? "red" : "green";
        System.out.printf( "  <rect x=\"%d\" y=\"%d\" width=\"10\" height=\"10\" style=\"fill:%s\" />%n",
                           x * 10, y * 10, color );
      }
    }
  }

  public static void main( String[] args ) {
    startSVG();
    printChessboard( 8 );
    endSVG();
  }
}
