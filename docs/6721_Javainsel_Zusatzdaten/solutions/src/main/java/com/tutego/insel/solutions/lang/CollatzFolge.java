package com.tutego.insel.solutions.lang;

class CollatzFolge {

  static void simpleCollatz1( int n ) {
    System.out.print( n + " -> " );

    while ( n > 1 ) {
      if ( n % 2 == 0 )
        n /= 2;
      else
        n = 3 * n + 1;
      System.out.print( n + " -> " );
    }
    System.out.println();
  }

  static void simpleCollatz2( int n ) {
    int max = 0, it = 0;

    while ( n > 1 ) {
      max = Math.max( max, n = (n % 2 == 0) ?
                               n / 2 :
                               3 * n + 1 );
      it++;
    }

    System.out.println( "Größte zwischendurch erreichte Zahl: " + max );
    System.out.println( "Anzahl der Iterationen: " + it );
  }

  private static long iterate( long n ) {
    long max = n;
    while ( n != 1 ) {
      if ( n % 2 == 0 ) {
        n /= 2;
      }
      else {
        n = n * 3 + 1;
        max = n > max ? n : max;
      }
    }
    return max;
  }

  public static void main( String[] args ) {
    
    simpleCollatz1( 27 );
    simpleCollatz2( 27 );
    
    long value = 1, max, maxdiff = 0, maxdiffvalue = 1;
    byte found = 0;

    while ( found < 100 ) {
      max = iterate( value );
      if ( max > value ) {
        System.out.printf( "%5d --> %10d (Delta: %10d)%n", value, max, max - value );
        if ( (max - value) > maxdiff ) {
          maxdiff = max - value;
          maxdiffvalue = value;
        }
        found++;
      }
      value++;
    }
    System.out.println( "Größte Differenz (" + maxdiff + ") ergab sich bei " + maxdiffvalue );
  }
}