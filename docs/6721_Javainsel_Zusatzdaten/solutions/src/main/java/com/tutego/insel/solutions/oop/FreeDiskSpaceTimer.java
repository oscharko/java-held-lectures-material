package com.tutego.insel.solutions.oop;

import java.util.Timer;
import java.util.TimerTask;

public class FreeDiskSpaceTimer {
  public static void main( String[] args ) {
    new Timer().schedule( new FreeDiskSpaceTimerTask(), 0, 2000 /* ms */ );
  }
}

class FreeDiskSpaceTimerTask extends TimerTask {
  public final static long MIN_CAPACITY = 100_000_000_000L;

  @Override public void run() {
    long freeDiskSpace = new java.io.File( "C:" ).getFreeSpace();
    if ( freeDiskSpace < MIN_CAPACITY )
      System.out.printf( "Platte voll, weniger als %,d Bytes frei, und zwar %,d Bytes%n", MIN_CAPACITY, freeDiskSpace );
  }
}
