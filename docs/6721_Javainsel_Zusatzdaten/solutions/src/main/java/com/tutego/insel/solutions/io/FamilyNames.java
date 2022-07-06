package com.tutego.insel.solutions.io;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyNames {

  public static void main( String[] args ) {
    final int MAXLEN = 20;

    @SuppressWarnings( "unchecked" )
    ArrayList<String>[] listen = new ArrayList[MAXLEN];

    for ( int i = 0; i < listen.length; i++ )
      listen[ i ] = new ArrayList<>();

    try ( Scanner scanner = new Scanner( FamilyNames.class.getResourceAsStream( "family-names.txt" ) ) ) {
      while ( scanner.hasNextLine() ) {
        String line = scanner.nextLine();
        listen[ line.length() ].add( line );
      }

      for ( int i = 0; i < listen.length; i++ ) {
        System.out.println( "Folgende Namen haben " + i + " Zeichen:" );

        for ( int j = 0; j < listen[ i ].size(); j++ )
          System.out.println( listen[ i ].get( j ) );
      }
    }
  }
}