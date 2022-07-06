package com.tutego.insel.solutions.thread;

public class Sleep extends Thread {

  public static void main( String[] args ) throws Exception {
    if ( args.length == 0 ) {
      System.err.println( "Hui, da fehlt aber was!" );
      return;
    }

    int time = 0;

    try {
      time = Integer.parseInt( args[ 0 ] );
    }
    catch ( NumberFormatException e ) {
      System.err.println( "Zahl fehlerhaft!" );
      return;
    }

    time *= 1000;

    if ( args.length == 2 ) {
      switch ( args[ 1 ].toLowerCase().charAt( 0 ) ) {
        case 's':
          break;
        case 'm':
          time *= 60;
          break;
        case 'h':
          time *= 60 * 60;
          break;
        case 'd':
          time *= 60 * 60 * 24;
          break;
      }
    }

    System.out.println( "Schlafe " + time + " Millisekunden" );

    Thread.sleep( time );
  }
}