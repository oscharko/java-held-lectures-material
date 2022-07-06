package com.tutego.insel.string;

import java.util.*;
import java.text.*;

class CollatorStrengthDemo {

  static void printOrder( Collator col, String a, String b ) {
    int comparison = col.compare( a, b );
    if ( comparison  < 0 ) System.out.println( a + " < " + b );
    else if ( comparison == 0 ) System.out.println( a + " = " + b );
    else if ( comparison  > 0 ) System.out.println( a + " > " + b );
  }

  public static void main( String[] args ) {
    Collator col = Collator.getInstance( Locale.GERMAN );

    System.out.println( "Strength = PRIMARY" );
    col.setStrength( Collator.PRIMARY );
    printOrder( col, "abc", "ABC" );       // abc = ABC
    printOrder( col, "Quäken", "Quaken" ); // Quäken = Quaken
    printOrder( col, "boß", "boss" );      // boß = boss
    printOrder( col, "boß", "boxen" );     // boß < boxen

    System.out.printf( "%nStrength =  SECONDARY%n" );
    col.setStrength( Collator.SECONDARY );
    printOrder( col, "abc", "ABC" );       // abc = ABC
    printOrder( col, "Quäken", "Quaken" ); // Quäken > Quaken
    printOrder( col, "boß", "boss" );      // boß = boss
    printOrder( col, "boß", "boxen" );     // boß < boxen

    System.out.printf( "%nStrength =  TERTIARY%n" );
    col.setStrength( Collator.TERTIARY );
    printOrder( col, "abc", "ABC" );       // abc < ABC
    printOrder( col, "Quäken", "Quaken" ); // Quäken > Quaken
    printOrder( col, "boß", "boss" );      // boß > boss
    printOrder( col, "boß", "boxen" );     // boß < boxen
  }
}