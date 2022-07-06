package com.tutego.insel.solutions.lang;

class FrequenzKonvertierung {

  static String onlyNumbers( String s ) {
    StringBuilder sb = new StringBuilder();
    for ( int i = 0; i < s.length(); i++ ) {
      char c = s.charAt( i );
      if ( ((c >= '1') && (c <= '9')) || ((c >= '+') && (c <= '.')) )
        sb.append( c );
    }
    return sb.toString();
  }

  public static double toFrequence( String s ) {
    return stringDoubleToDouble( onlyNumbers( s ) );
  }

  public static double stringDoubleToDouble( String s ) {
    String doubleString = s.replace( ',', '.' );
    return Double.parseDouble( doubleString );
  }

  public static void main( String[] args ) {
    System.out.println( toFrequence( "Hallo hier ist 1,2345 was los!!" ) );
  }
}