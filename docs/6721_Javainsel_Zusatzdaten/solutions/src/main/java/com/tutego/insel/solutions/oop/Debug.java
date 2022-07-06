package com.tutego.insel.solutions.oop;

public class Debug {

  private static boolean isDebugging;

  static void ein() {
    isDebugging = true;
  }

  static void aus() {
    isDebugging = false;
  }

  static void out( String s ) {
    if ( isDebugging )
      System.out.println( s );
  }
}
