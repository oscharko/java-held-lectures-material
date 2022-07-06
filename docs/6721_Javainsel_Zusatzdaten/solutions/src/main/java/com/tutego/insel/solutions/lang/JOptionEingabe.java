package com.tutego.insel.solutions.lang;

import javax.swing.*;

public class JOptionEingabe {

  public static void main( String[] args ) {
    String s = JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
    System.out.println( s + "\t" + s );

    int x = Integer.parseInt( s );
    System.out.println( x * x ); // oder für x * x auch Math.pow( x, 2 );

    System.exit( 0 );
  }
}