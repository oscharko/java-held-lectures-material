package com.tutego.insel.solutions.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindBigGifImages {

  public static void main( String[] args ) throws IOException {

    String filename = "";
    Path root = Paths.get( filename );
    DirectoryStream<Path> files = Files.newDirectoryStream( root,
                                                            FindBigGifImages::isLargeGif );
    files.forEach( System.out::println );
  }

  static boolean isLargeGif( Path entry ) {
    if ( !Files.isRegularFile( entry ) )
      return false;
    try ( RandomAccessFile f = new RandomAccessFile( entry.toFile(), "r" ) ) {
      f.seek( 6 );
      int width = f.read() + f.read() * 256;
      return width > 1024;
    }
    catch ( IOException e ) {
      throw new UncheckedIOException( e );
    }
  }
}
