package com.tutego.insel.solutions.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestLineInFile {
  public static void main( String[] args ) throws FileNotFoundException {
    int maxLen = 0;

    try ( Scanner scanner = new Scanner( new File( "c:/UllisDB.script" ) ) ) {
      while ( scanner.hasNextLine() )
        maxLen = Math.max( maxLen, scanner.nextLine().length() );

      System.out.println( maxLen );
    }
  }
}
