package com.tutego.insel.solutions.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConvertFileToUppercase {

  static void convertFileToUppercase( Path inPath, Path outPath ) throws IOException {

    try ( BufferedReader reader = Files.newBufferedReader( inPath );
          BufferedWriter writer = Files.newBufferedWriter( outPath ) ) {
      while ( reader.ready() )
        writer.write( Character.toUpperCase( (char) reader.read() ) );
    }
  }

  public static void main( String[] args ) {
  }
}
