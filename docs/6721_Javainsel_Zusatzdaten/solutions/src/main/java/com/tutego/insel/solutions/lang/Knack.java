package com.tutego.insel.solutions.lang;

public class Knack {

  private static final String KNACK = "♬KNACK♪";

  static String knack( String text ) {
    StringBuilder ausgabe = new StringBuilder( text );

    for ( int i = text.length() - 1; i >= 0; i-- )
      if ( Math.random() < 0.1 )
        ausgabe.insert( i, KNACK );

    return ausgabe.toString();
  }

  static String deKnack( String text ) {
    return text.replace( KNACK, "" );
  }

  public static void main( String[] args ) {
    String s = "Höhlen und Fledermäuse statt heiße Lava erwarten die Besucher des australischen Undara Volcanic Nationalpark";
    String t = knack( s );
    System.out.println( t );
    System.out.println( deKnack( t ) );
  }
}