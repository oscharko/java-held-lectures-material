package com.tutego.insel.solutions.lang;

public class Dice {
  public static void main( String[] args ) {
    int sum = 0;

    for ( int i = 0; i < 1000; i++ ) {
      int number = dice() + dice();

      switch ( number ) {
        case 12:
          sum = sum + 150;
          break;

        case 11:
          sum = sum + 100;
          break;

        case 10:
          sum = sum + 50;
          break;

        case 9:
        case 8:
        case 7:
          break;

        default:
          sum = sum - 50;
      }
    }

    System.out.println( "Gewinn: " + sum );
    
    testDistribution();
  }

  static void testDistribution() {
    int sumOf1 = 0, sumOf2 = 0, sumOf3 = 0, sumOf4 = 0, sumOf5 = 0, sumOf6 = 0;
    // Ein Array verkürzt das!
    
    for ( int i = 0; i < 10_000_000; i++ ) {
      switch ( dice() ) {
        case 1: sumOf1++; break;
        case 2: sumOf2++; break;
        case 3: sumOf3++; break;
        case 4: sumOf4++; break;
        case 5: sumOf5++; break;
        case 6: sumOf6++; break;
      }
    }

    System.out.println( "Augenzahl 1: " + sumOf1 );
    System.out.println( "Augenzahl 2: " + sumOf2 );
    System.out.println( "Augenzahl 3: " + sumOf3 );
    System.out.println( "Augenzahl 4: " + sumOf4 );
    System.out.println( "Augenzahl 5: " + sumOf5 );
    System.out.println( "Augenzahl 6: " + sumOf6 );
  }

  static int dice() {
    return (int) ((Math.random() * 100000) % 6) + 1;
  }
}