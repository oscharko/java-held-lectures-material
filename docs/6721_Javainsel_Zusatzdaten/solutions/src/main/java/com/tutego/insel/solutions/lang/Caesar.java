package com.tutego.insel.solutions.lang;

public class Caesar {

  public static String caesar( String s, int rotation ) {
    StringBuilder result = new StringBuilder( s.length() );

    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );

      if ( Character.isUpperCase( c ) )
        result.append( (char) ('A' + (c - 'A' + rotation) % 26) );
      else if ( Character.isLowerCase( c ) )
        result.append( (char) ('a' + (c - 'a' + rotation) % 26) );
      else
        result.append( c );
    }

    return result.toString();
  }

  public static String decaesar( String s, int rotation ) {
    return caesar( s, 26 - rotation );
  }

  public static void main( String[] args ) {
    String s = "abxyz ABXYZ";

    char rotation = 4;
    System.out.println( s );
    System.out.println( caesar( s, rotation ) );
    System.out.println( decaesar( caesar( s, rotation ), rotation ) );
  }
}