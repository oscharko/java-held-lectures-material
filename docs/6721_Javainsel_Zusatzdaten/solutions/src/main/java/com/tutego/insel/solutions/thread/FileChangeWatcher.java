﻿package com.tutego.insel.solutions.thread;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.function.Consumer;

public class FileChangeWatcher implements Runnable {

  private final Path path;
  private final Consumer<Path> callback;

  public FileChangeWatcher( String filename, Consumer<Path> callback ) {
    this.callback = callback;
    path = Paths.get( filename );
  }

  @Override
  public void run() {
    try {
      FileTime oldLastModified = Files.getLastModifiedTime( path );

      while ( true ) {
        Thread.sleep( 500 );

        FileTime lastModified = Files.getLastModifiedTime( path );
        if ( !oldLastModified.equals( lastModified ) ) {
          callback.accept( path );
          oldLastModified = lastModified;
        }
      }
    }
    catch ( Exception e ) {
      // Catch any exception and wrap in a runtime exception
      throw new RuntimeException( e );
    }
  }

  public static void main( String[] args ) {
    Consumer<Path> callback = path -> System.out.println( "File changed " + path );
    new Thread( new FileChangeWatcher( "c:/datei.txt", callback ) ).start();
  }
}
