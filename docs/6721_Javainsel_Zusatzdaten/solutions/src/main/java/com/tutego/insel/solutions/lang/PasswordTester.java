package com.tutego.insel.solutions.lang;

public class PasswordTester {

  static boolean isGoodPassword( String s ) {

    if ( s.length() < 8 ) {
      System.err.println("Passwort zu kurz");
    return false;
  }

    if ( !containsUppercaseLetter( s ) ) {
      System.err.println("Muss Gro�buchstaben enthalten");
    return false;
  }

    if ( !containsLowercaseLetter( s ) ) {
      System.err.println("Muss Kleinbuchstaben enthalten");
      return false;
    }

    if ( !containsDigit( s ) ) {
      System.err.println("Muss Ziffer enthalten");
      return false;
    }

    if ( !containsSpecialCharacter( s ) ) {
      System.err.println("Muss Sonderzeichen wie ., enthalten");
      return false;
    }

    return true;
  }

  private static boolean containsUppercaseLetter( String s ) {
    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );
      if ( Character.isUpperCase( c ) )
        return true;
    }
    return false;
  }

  private static boolean containsLowercaseLetter( String s ) {
    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );
      if ( Character.isLowerCase( c ) )
        return true;
    }
    return false;
  }

  private static boolean containsDigit( String s ) {
    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );
      if ( Character.isDigit( c ) )
        return true;
    }
    return false;
  }

  private static boolean containsSpecialCharacter( String s ) {
    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );
      if ( ".,".indexOf(c) > -1 )
        return true;
//      switch (c) {
//        case '.' :
//        case ',' :return true;
//      }
    }
    return false;
  }

  public static void main( String[] args ) {
    System.out.println( isGoodPassword( "hallo" ) );
    System.out.println( isGoodPassword( "1234" ) );
    System.out.println( isGoodPassword( "1h" ) );
    System.out.println( isGoodPassword( "11234H.allo" ) );
  }
}
