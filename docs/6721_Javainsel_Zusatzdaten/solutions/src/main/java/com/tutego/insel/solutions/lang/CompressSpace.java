package com.tutego.insel.solutions.lang;

public class CompressSpace {

  public static void main( String[] args ) {
    String s = compressSpace( "Hallo.   Das  ist ein  Beispiel." );
    System.out.println( s );
  }

  static String compressSpace( String s ) {
    return compressSpace( new StringBuilder( s ) ).toString();
  }

  static StringBuilder compressSpace( StringBuilder sb ) {
    int index = sb.lastIndexOf( "  " );

    while ( index >= 0 ) {
      sb.deleteCharAt( index );
      index = sb.lastIndexOf( "  " );
    }
    return sb;
  }
}