package com.tutego.insel.solutions.thread;

public class ThreadUncaughtExceptionHandlerDemo
{
  public static void main( String[] args )
  {
    Thread.setDefaultUncaughtExceptionHandler( new MyUncaughtExceptionHandler() );

    System.out.println( "Main" );

    Thread t1 = new Thread( new Runnable() {
      @Override public void run() {
        System.out.println( "1. Thread" );
        System.out.println( 1 / 0 );
      } } );
    t1.start();
    
    System.out.println( "Main" );

    new Thread( new Runnable() {
      @Override public void run() {
        System.out.println( "2. Thread" );
      } } ).start();

    System.out.println( "Main" );
  }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
{
  @Override public void uncaughtException( Thread t, Throwable e )
  {
    System.out.println( t + ", '" + e.getMessage() + "'" );
  }  
}