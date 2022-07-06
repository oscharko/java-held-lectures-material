package com.tutego.insel.solutions.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleStringCompressor {

  public static String compress( String input ) {
    if ( input.isEmpty() ) {
      return "";
    }
    char lastChar = input.charAt( 0 );
    int counter = 0;
    StringBuilder result = new StringBuilder();

    for ( int i = 0; i < input.length(); i++ ) {
      char c = input.charAt( i );
      if ( c != lastChar ) {
        result.append( lastChar );
        if ( counter > 2 )
          result.append( counter );
        counter = 1;
      }
      lastChar = c;
      counter++;
    }

    result.append( lastChar );
    if ( counter > 2 )
      result.append( counter );

    return result.toString();
  }

  private static CharSequence decodeToken( String token ) {
    if ( token.isEmpty() )
      return "";

    StringBuilder result = new StringBuilder();
    int length = token.length() == 1 ? 1 : Integer.parseInt( token.substring( 1 ) );
    for ( int i = 0; i < length; i++ )
      result.append( token.charAt( 0 ) );

    return result;
  }

  public static String decode( String input ) {
    StringBuilder result = new StringBuilder();
    Matcher pattern = Pattern.compile( "[.-](\\d*)" ).matcher( input );
    while ( pattern.find() ) {
      result.append( decodeToken( pattern.group() ) );
    }
    return result.toString();
  }

  public static void main( String[] args ) {
    String input = "....-.--...";
    System.out.println( compress( input ) );
    System.out.println( decode( compress( input ) ) );
  }
}
