package com.tutego.insel.solutions.thread;

public class Kindergarten {

  public static void main( String[] args ) {
    Malkasten malkasten = new Malkasten( 12 );

    Thread mirijam = new Kind( "Mirijam", malkasten );
    Thread susanne = new Kind( "Susanne", malkasten );
    Thread soeren = new Kind( "Soeren", malkasten );
    Thread dieter = new Kind( "Dieter", malkasten );

    mirijam.start();
    susanne.start();
    soeren.start();
    dieter.start();
  }
}
