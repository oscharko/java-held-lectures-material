package com.tutego.insel.main;

import com.tutego.insel.greeter.Greeter;

public class Main {

  public static void main( String[] args ) {
    Greeter.instance().greet( "Chris" );
  }
} 