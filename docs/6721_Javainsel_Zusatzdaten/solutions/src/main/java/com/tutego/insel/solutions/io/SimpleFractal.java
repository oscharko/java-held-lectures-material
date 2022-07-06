package com.tutego.insel.solutions.io;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleFractal {

  private static final String FILENAME = "fractal.html";

  public static void main( String[] args ) {

    try ( Writer out = Files.newBufferedWriter( Paths.get( FILENAME ) );
          PrintWriter printer = new PrintWriter( out ) ) {

      printer.println( "<!DOCTYPE html>" );
      printer.println( "<html><body><svg width=\"256\" height=\"256\">" );

      for ( int x = 0; x < 256; x++ )
        for ( int y = 0; y < 256; y++ )
          printer.printf( "<rect x=\"%d\" y=\"%d\" width=\"1\" height=\"1\" style=\"fill:rgb(0,%d,0);\" />",
                          x, y, x ^ y );

      printer.println( "</svg></body></html>" );

      Desktop.getDesktop().open( new File( FILENAME ) );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
