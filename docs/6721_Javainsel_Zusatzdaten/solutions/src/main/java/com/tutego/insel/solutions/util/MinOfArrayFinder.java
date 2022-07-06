package com.tutego.insel.solutions.util;

import java.util.Arrays;

public class MinOfArrayFinder {

  public static void main( String[] args ) {
    int[] ints = { 9, 1, 3, 0, 3 };

    int min = min( ints );

    System.out.println( min );
  }

  private static int min( int[] ints ) {
    if ( ints == null || ints.length == 0 )
      throw new IllegalArgumentException();

    ints = (int[]) ints.clone();

    Arrays.sort( ints );

    return ints[ 0 ];
  }
}