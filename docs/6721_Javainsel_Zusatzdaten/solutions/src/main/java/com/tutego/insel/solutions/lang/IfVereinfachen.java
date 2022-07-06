package com.tutego.insel.solutions.lang;

import javax.swing.*;

public class IfVereinfachen {

  public static void main( String[] args ) {
    String s = JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
    int i = Integer.parseInt( s );

    if ( (i == 2) || (i == 20) || (i == 200) )
      System.out.println( "Aha: A ist gleich " + i + " (if)" );

    switch ( i ) {
      case 2:
      case 20:
      case 200:
        System.out.println( "Aha: A ist gleich " + i + " (switch)" );
    }
  }
}