package com.tutego.insel.solutions.lang;

import javax.swing.*;

public class GeradeUngerade {

  public static void main( String[] args ) {
    String s = JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
    int i = Integer.parseInt( s );

    if ( (i % 2) == 0 )
      System.out.println( "s modulo 2 == 0 -> gerade" );
    else
      System.out.println( "s modulo 2 != 0 -> ungerade" );

    if ( (i & 1) == 0 )
      System.out.println( "s und 1 == 0 -> gerade " );
    else
      System.out.println( "s und 1 != 0 -> ungerade" );
  }
}