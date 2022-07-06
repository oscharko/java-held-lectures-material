package com.tutego.insel.solutions.lang;

public class SumOfTheDigits {

  static int sumOfTheDigits( long value ) {
    return sumOfTheDigits( String.valueOf( value ) );
  }

  static int sumOfTheDigits( String value ) {
    int result = 0;

    for ( int i = 0; i < value.length(); i++ )
      result += (value.charAt( i ) - '0');

    return result;
  }
}