package com.tutego.insel.solutions.lang;

// http://www.artists.de/281604-hommage-au-pointillismus

public class SoManyCircles {

  public static void main( String[] args ) {

    int distance = 20;
    int margin = 2 * distance;

    startSvg();
    int offset = 0;
    for ( int y = margin; y <= 1000 - margin; y = y + distance ) {
      offset = y % (2 * distance) == 0 ? 0 : distance / 2;

      for ( int x = margin; x < 1000 - margin; x = x + distance ) {
        circleSvg( x, y, offset );
      }
    }
    endSvg();

  }

  static void circleSvg( int x, int y, int offset ) {
    System.out.printf( "<circle cx=\"%d\" cy=\"%d\" r=\"7\" fill=\"%s\" />%n",
                       x + offset, y, printRandomColor() );
  }

  static void startSvg() {
    System.out.println( "<svg height=\"1000\" width=\"1000\" style='background-color: #5C5B57'>" );
  }

  static void endSvg() {
    System.out.println( "</svg>" );
  }

  static String printRandomColor() {
    int newColor = (int) (Math.random() * 6);
    switch ( newColor ) {
      case 0: return "#137546";
      case 1: return "#AB1912";
      case 2: return "#9F7B07";
      case 3: return "#110F14";
      case 4: return "#97948F";
      default : return "#004F88";
    }
  }
}
