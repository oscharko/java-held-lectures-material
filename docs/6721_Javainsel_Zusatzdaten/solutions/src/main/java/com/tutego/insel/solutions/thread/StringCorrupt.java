package com.tutego.insel.solutions.thread;

public class StringCorrupt implements Runnable {

  public static void main( String[] args ) throws InterruptedException {
    StringCorrupt r = new StringCorrupt();
    Thread t1 = new Thread( r );
    t1.start();
    Thread t2 = new Thread( r );
    t2.start();
    Thread t3 = new Thread( r );
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    System.out.println( r.sb );
  }

  final StringBuilder sb = new StringBuilder();
  // final StringBuffer sb = new StringBuffer();

  @Override
  public void run() {
    for ( int i = 0; i < 100; i++ )
      sb.append( Thread.currentThread().toString() );
  }
}
