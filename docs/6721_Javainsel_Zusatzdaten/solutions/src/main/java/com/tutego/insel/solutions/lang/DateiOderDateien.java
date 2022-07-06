package com.tutego.insel.solutions.lang;

public class DateiOderDateien {

  public static void main( String[] args ) {
    int noOfFiles = 1;  // oder 0, 1, 99, ...
    System.out.printf( "Es gibt %s Datei%s.", noOfFiles,
                       noOfFiles != 1 ? "en" : "" );
  }
}
