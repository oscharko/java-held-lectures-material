package com.tutego.insel.solutions.lang;

import java.util.Arrays;

public class RemoveVowel {

  public static void main( String[] args ) {
    System.out.println( removeVowels1( "Hallo Javanesen" ) );
    System.out.println( removeVowels2( "Hallo Javanesen" ) );
  }

  static String removeVowels1( String s ) {
    char[] chars = new char[s.length()];
    int len = 0;

    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );

      if ( "aeiouöäüyAEIOUÄÖÜY".indexOf( c ) < 0 )
        chars[ len++ ] = c;
    }

    return new String( chars, 0, len );
  }

  private final static char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'ä', 'ö', 'ü' };

  static String removeVowels2( String s ) {
    String newText = "";
    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );
      int pos = Arrays.binarySearch( VOWELS, Character.toLowerCase( c ) );
      if ( pos < 0 )
        newText = newText + c;
    }
    return newText;
  }
}
