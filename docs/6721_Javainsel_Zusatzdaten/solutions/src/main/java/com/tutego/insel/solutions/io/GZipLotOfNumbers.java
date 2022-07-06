package com.tutego.insel.solutions.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPOutputStream;

public class GZipLotOfNumbers {

  public static void main( String[] args ) throws IOException {

    Path tempFile1 = Files.createTempFile( "zahlen", "bin" );
    Path tempFile2 = Files.createTempFile( "zahlen", "bin" );

    try ( OutputStream fos = Files.newOutputStream( tempFile1 );
          DataOutputStream out = new DataOutputStream( fos ) ) {
      for ( int i = 0; i < 1_000_000; i++ )
        out.writeInt( i );
    }

    try ( OutputStream fos = Files.newOutputStream( tempFile2 );
          OutputStream gos = new GZIPOutputStream( fos );
          DataOutputStream out = new DataOutputStream( gos ) ) {
      for ( int i = 0; i < 1_000_000; i++ )
        out.writeInt( i );
    }

    System.out.println( "Unkomprimiert: " + Files.size( tempFile1 ) );
    System.out.println( "Komprimiert:   " + Files.size( tempFile2 ) );

    Files.delete( tempFile1 );
    Files.delete( tempFile2 );
  }
}
