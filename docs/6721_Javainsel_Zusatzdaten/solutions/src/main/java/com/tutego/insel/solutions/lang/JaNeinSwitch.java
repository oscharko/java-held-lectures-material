package com.tutego.insel.solutions.lang;

public class JaNeinSwitch {

  public static void main( String[] args ) {

    String input = javax.swing.JOptionPane.showInputDialog( null, "Ja oder Nein?" );
    
    if ( input == null )
      System.exit( 1 );

    switch ( input ) {
      case "ja":
      case "j":
        System.out.println( true );
        break;

      case "nein":
      case "n":
        System.out.println( false );
        break;

      default :
        System.out.println( "nicht erkannte Eingabe" );
    }
  }
}