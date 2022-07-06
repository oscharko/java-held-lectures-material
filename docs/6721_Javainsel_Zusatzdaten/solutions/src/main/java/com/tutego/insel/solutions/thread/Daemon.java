package com.tutego.insel.solutions.thread;

public class Daemon {

  public static void main( String[] args ) {
    Thread t = new Thread( new RunIt() );
    t.setDaemon( true );

    t.start();

    try {
      Thread.sleep( 2000 );
    }
    catch ( InterruptedException e ) {
    }
  }

  static class RunIt implements Runnable {
    @Override
    public void run() {
      while ( true ) {
        try {
          Thread.sleep( 1000 );
        }
        catch ( InterruptedException e ) { }

        System.out.println( "Laeuft noch..." );
      }
    }
  }
}