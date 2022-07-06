package com.tutego.insel.solutions.array;

public class EquationReader {

  public static void main( String[] args ) {

    char[] expression = { '1', '-', '2', '*', '3', '/', '4' };

    String[] numbers = { "null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun" };
    for ( int i = 0; i < expression.length; i++ ) {
      char c = expression[ i ];
      if ( c >= '0' && c <= '9' )
        System.out.printf( "%s ", numbers[c - '0'] );
      switch ( c ) {
        case '+':
          System.out.print( "plus " );
          break;
        case '-':
          System.out.print( "minus " );
          break;
        case '*':
          System.out.print( "mal " );
          break;
        case '/':
          System.out.print( "durch " );
          break;
      }
    }
  }
}
