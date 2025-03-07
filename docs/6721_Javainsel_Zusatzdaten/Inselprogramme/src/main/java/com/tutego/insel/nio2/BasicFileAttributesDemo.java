package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo {
  public static void main( String[] args ) throws IOException {
    Path p = Paths.get( "src/main/resources/lyrics.txt" );
    BasicFileAttributes attrs = Files.readAttributes( p, BasicFileAttributes.class ); 
    System.out.println( attrs.isRegularFile() );    // true
    System.out.println( attrs.isDirectory() );      // false
    System.out.println( attrs.isSymbolicLink() );   // false
    System.out.println( attrs.isOther() );          // false
    System.out.println( attrs.lastModifiedTime() ); // 2006-05-23T12:36:54Z
    System.out.println( attrs.lastAccessTime() );   // 2017-05-27T13:06:13.183Z
    System.out.println( attrs.creationTime() );     // 2017-05-27T13:06:09.503118Z
    System.out.println( attrs.size() );             // 14
  }
}