package com.tutego.insel.solutions.thread;

public class ThreadDemo implements Runnable {

  private int nr;

  ThreadDemo( int nr ) {
    this.nr = nr;

    new Thread( this ).start();
  }

  @Override
  public void run() {
    while ( true )
      System.out.println( "Thread " + nr );
  }

  public static void main( String[] args ) {
    for ( int i = 1; i < 100; i++ )
      new ThreadDemo( i );
  }
}