package com.tutego.insel.solutions.lang;

import javax.swing.JOptionPane;

public class AskForCurrency {

  enum Currency {
    EUR, USD
  }

  public static void main( String[] args ) {
    String input = JOptionPane.showInputDialog( null, "Bitte Währung eingeben" );

    try {
      Currency currency = Currency.valueOf( input.toUpperCase() );

      switch ( currency ) {
        case EUR:
          System.out.println( "EUR" );
          break;

        case USD:
          System.out.println( "USD" );
          break;

        default :
          System.err.println( "Wir sollten hier nicht hinkommen" );
      }
    }
    catch ( IllegalArgumentException e ) {
      System.err.println( "Unbekannte Währung" );
    }
  }
}