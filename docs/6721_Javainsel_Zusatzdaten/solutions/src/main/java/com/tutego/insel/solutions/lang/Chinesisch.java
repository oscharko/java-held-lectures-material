package com.tutego.insel.solutions.lang;

public class Chinesisch {

  static String speekChineese( String text ) {
    text = text.replace( 'r', 'l' );
    text = text.replace( 'R', 'L' );

    return text;
  }

  static void speekChineese1( String text ) {
    for ( int i = 0; i < text.length(); i++ ) {
      char c = text.charAt( i );

      if ( c == 'r' )
        c = 'l';
      else if ( c == 'R' )
        c = 'L';

      System.out.print( c );
    }
    System.out.println();
  }

  static String speekChineese2( String text ) {
    char[] c = text.toCharArray();

    for ( int i = 0; i < c.length; i++ ) {
      if ( c[ i ] == 'r' )
        c[ i ] = 'l';
      else if ( c[ i ] == 'R' )
        c[ i ] = 'L';
    }
    return new String( c );
  }

  static void speekChineese3( String text ) {
    for ( int i = 0; i < text.length(); i++ ) {
      switch ( text.charAt( i ) ) {
        case 'r':
          System.out.print( 'l' );
          break;
        case 'R':
          System.out.print( 'L' );
          break;
        default :
          System.out.print( text.charAt( i ) );
      }
    }
  }

  public static void main( String[] args ) {
    System.out.println( speekChineese( "Riesenrad" ) );
    speekChineese1( "Riesenrad" );

    System.out.println( speekChineese2( "Riesenrad" ) );
    speekChineese3( "Riesenrad" );
  }
}