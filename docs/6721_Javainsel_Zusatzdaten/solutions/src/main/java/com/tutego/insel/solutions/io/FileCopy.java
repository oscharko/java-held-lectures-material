package com.tutego.insel.solutions.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {

  public static void main( String[] args ) {
    // System.out.println( fileCopy( "c:/test.txt", "c:/blub.txt" ) );

    cloneFile( "c:/test.txt" );
  }

  public static void cloneFile( String filename ) {
    Path srcPath = Paths.get( filename );

    Path parent = srcPath.getParent(), filenaname = srcPath.getFileName();

    Path fcopy = parent.resolve( "Kopie von " + filenaname );

    int i = 2;

    while ( Files.exists( fcopy ) )
      fcopy = parent.resolve( "Kopie (" + i++ + ") von " + filenaname );

    copyFile( srcPath, fcopy );
  }

  public static boolean copyFile( Path source, Path dest ) {
    try ( InputStream  in  = Files.newInputStream( source );
          OutputStream out = Files.newOutputStream( dest ) ) {

      byte[] buffer = new byte[4096];

      for ( int len; (len = in.read( buffer )) > 0; )
        out.write( buffer, 0, len );
    }
    catch ( IOException e ) {
      return false;
    }
    return true;
  }

  public static boolean copyFile( String source, String dest ) {
    return copyFile( Paths.get( source ), Paths.get( dest ) );
  }
}