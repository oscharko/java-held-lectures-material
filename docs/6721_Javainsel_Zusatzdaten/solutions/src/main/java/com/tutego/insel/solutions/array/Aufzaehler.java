package com.tutego.insel.solutions.array;

public class Aufzaehler {
  
  public static void main( String[] args ) {
    readTerm( "1 - 2 * 3 / 4".toCharArray() );
  }

  static String[] writtenNumbers = {
    "Null", "Eins", "Zwei", "Drei", "Vier", "Fuenf", "Sechs", "Sieben", "Acht", "Neun"
  };

  static void readTerm( char[] characters ) {
    for ( char c : characters ) {
      String ausgabe = "";

      if ( c >= '0' && c <= '9' ) {
        int index = c - '0';
        ausgabe = writtenNumbers[ index ] + " ";
      }
      else {
        switch ( c ) {
          case ' ':
          case '\t':
            break;
          case '+':
            ausgabe = "plus ";
            break;
          case '-':
            ausgabe = "minus ";
            break;
          case '*':
            ausgabe = "mal ";
            break;
          case '/':
            ausgabe = "geteilt durch ";
            break;
          default :
            ausgabe = "nicht gültig ";
        }
      }
      System.out.print( ausgabe );
    }
  }
}