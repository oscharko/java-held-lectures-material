package com.tutego.insel.exception;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindAllEmailAddresses2 {

  public static void main( String[] args ) {
    try {
      printAllEMailAddresses( "https://www.rheinwerk-verlag.de/hilfe/service-und-kontakt_8" );
    } catch ( MalformedURLException e ) {
      System.err.println( "URL ist falsch aufgebaut!" );
    } catch ( IOException e ) {
      System.err.println( "URL konnte nicht geöffnet werden!" );
    }
  }

  @SuppressWarnings( "resource" )
  static void printAllEMailAddresses( String urlString ) throws MalformedURLException, IOException {
    Scanner scanner = new Scanner( new URL( urlString ).openStream() );
    Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );

    for ( String email; (email = scanner.findWithinHorizon( pattern, 0 )) != null; )
      System.out.println( email );
  }
}