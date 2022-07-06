package com.tutego.insel.solutions.lang;

public class Palindrom {

  public static boolean isPalindrom( String s ) {
    int ende = s.length();
    int mitte = ende / 2;

    for ( int i = 0; i < mitte; i++ )
      if ( s.charAt( i ) != s.charAt( ende - i - 1 ) )
        return false;

    return true;
  }

  public static void main( String[] args ) {
    System.out.println( isPalindrom( "aaabaaa" ) );
  }
}
