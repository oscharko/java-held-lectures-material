package com.tutego.insel.solutions.lang;

public class Muenzmaschine {

  public static void main( String[] args ) {

    double d = 1.59;

    System.out.println( (int) (d / 2) + " x 2 €" );
    d %= 2;

    System.out.println( (int) (d / 1) + " x 1 €" );
    d %= 1;

    System.out.println( (int) (d / 0.5) + " x 50 Cent" );
    d %= 0.5;

    System.out.println( (int) (d / 0.2) + " x 20 Cent" );
    d %= 0.2;

    System.out.println( (int) (d / 0.1) + " x 10 Cent" );
    d %= 0.1;

    System.out.println( (int) (d / 0.05) + " x 5 Cent" );
    d %= 0.05;

    System.out.println( (int) (d / 0.02) + " x 2 Cent" );
    d %= 0.02;

    System.out.println( (int) (d / 0.01) + " x 1 Cent" );
  }
}
