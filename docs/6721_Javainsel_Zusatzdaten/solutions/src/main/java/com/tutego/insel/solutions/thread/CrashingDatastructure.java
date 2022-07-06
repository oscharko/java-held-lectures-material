package com.tutego.insel.solutions.thread;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class CrashingDatastructure {

  public static void main( String[] args ) throws InterruptedException {

    Set<Integer> set = new TreeSet<>();
    // Set<Integer> set = Collections.synchronizedSortedSet( new TreeSet<>() );
    // Set<Integer> set = ConcurrentHashMap.newKeySet();
    AtomicInteger integer = new AtomicInteger( 0 );
    Runnable run = () -> {
      for ( int i = 0; i < 1000; i++ )
        set.add( integer.getAndIncrement() );
    };

    Thread[] threads = {new Thread( run ), new Thread( run ), new Thread( run )};
    Arrays.asList( threads ).forEach( Thread::start );
    threads[ 0 ].join();
    threads[ 1 ].join();
    threads[ 2 ].join();

    System.out.printf( "Erwarte %d Elemente, enthalten %d Elemente%n", 3 * 1000, set.size() );
  }
}