package com.tutego.insel.solutions.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class GenerateSVGfromCSVcoordinates {

  public static void main( String[] args ) throws IOException {

    try ( Scanner scanner = new Scanner( Paths.get( "koordinaten.csv" ) ) ) {
      scanner.useDelimiter( ";|\\s+" );

      StringBuilder svg = new StringBuilder( 1024 );
      svg.append( "<svg height=\"210\" width=\"500\"><polygon points=\"" );

      while ( scanner.hasNext() ) {
        String x = scanner.next();
        String y = scanner.next();
        svg.append( x ).append( "," ).append( y ).append( " " );
      }

      svg.append( "\" style=\"fill:lime;stroke:purple;stroke-width:1\" /></svg>" );

      Files.write( Paths.get( "svg.html" ), svg.toString().getBytes( "UTF-8" ) );

      // System.out.println(svg);
    }
  }
}
