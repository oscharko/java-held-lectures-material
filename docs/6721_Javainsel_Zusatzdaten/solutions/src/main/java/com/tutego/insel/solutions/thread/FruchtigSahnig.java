package com.tutego.insel.solutions.thread;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FruchtigSahnig {

  public static void main( String[] args ) {

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    Runnable runnable = () -> {
      while ( true ) {
        try {
          lock.lock();
          // Erst denken, dann reden
          Thread.sleep( ThreadLocalRandom.current().nextInt( 1000 ) );
          System.out.println( Thread.currentThread().getName() );
          condition.signalAll();
          condition.await();
        }
        catch ( InterruptedException e ) {
          e.printStackTrace();
        }
        finally {
          lock.unlock();
        }
      }
    };

    new Thread( runnable, "fruchtig" ).start();
    new Thread( runnable, "sahnig" ).start();
  }
  
}