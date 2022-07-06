package com.tutego.insel.solutions.lang;

import javax.swing.*;

public class LineUtils {

  public static void linie( int n ) {
    for ( int i = 0; i < n; i++ )
      System.out.print( "-" );
  }

  public static void main( String[] args ) {
    String s = JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
    linie( Integer.parseInt( s ) );
  }
}
