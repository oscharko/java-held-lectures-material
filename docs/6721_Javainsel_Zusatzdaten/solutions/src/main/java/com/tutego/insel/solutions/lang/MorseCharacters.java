package com.tutego.insel.solutions.lang;

public class MorseCharacters {

  public static void morse( String text ) {
    for ( int i = 0; i < text.length(); i++ ) {
      String morse = "";
      switch ( Character.toUpperCase( text.charAt( i ) ) ) {
        case 'A': morse = ".- "; break;
        case 'B': morse = "-... "; break;
        case 'C': morse = "-.-. "; break;
        case 'D': morse = "-.. "; break;
        case 'E': morse = ". "; break;
        case 'F': morse = "..-. "; break;
        case 'G': morse = "--. "; break;
        case 'H': morse = ".... "; break;
        case 'I': morse = ".. "; break;
        case 'J': morse = ".--- "; break;
        case 'K': morse = "-.- "; break;
        case 'L': morse = ".-.. "; break;
        case 'M': morse = "-- "; break;
        case 'N': morse = "-. "; break;
        case 'O': morse = "--- "; break;
        case 'P': morse = ".--. "; break;
        case 'Q': morse = "--.- "; break;
        case 'R': morse = ".-. "; break;
        case 'S': morse = "... "; break;
        case 'T': morse = "- "; break;
        case 'U': morse = "..- "; break;
        case 'V': morse = "...- "; break;
        case 'W': morse = ".-- "; break;
        case 'X': morse = "-..- "; break;
        case 'Y': morse = "-.-- "; break;
        case 'Z': morse = "--.. "; break;
        case '0': morse = "----- "; break;
        case '1': morse = ".---- "; break;
        case '2': morse = "..--- "; break;
        case '3': morse = "...-- "; break;
        case '4': morse = "....- "; break;
        case '5': morse = "..... "; break;
        case '6': morse = "-.... "; break;
        case '7': morse = "--... "; break;
        case '8': morse = "---.. "; break;
        case '9': morse = "----. "; break;
      }
      System.out.print( morse );
    }
    System.out.println();
  }
}