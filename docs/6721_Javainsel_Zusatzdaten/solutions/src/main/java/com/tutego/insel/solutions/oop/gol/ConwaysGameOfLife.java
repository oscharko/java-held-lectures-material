package com.tutego.insel.solutions.oop.gol;

import java.util.Random;

public class ConwaysGameOfLife {

  public static void main( String[] args ) {

    Cells generation1 = new Cells( 10 );
    generation1.randomCellsAlive();
    generation1.print();

    System.out.println( "------------------------------------------" );

    Cells generation2 = generation1.nextGeneration();
    generation2.print();
  }
}

class Cells {

  private final boolean[][] array;

  public Cells( int size ) {
    // at the beginning the array elements are false = everything is dead
    array = new boolean[ size ][ size ];
  }

  public Cells randomCellsAlive() {
    Random random = new Random();
    int size = array.length;
    for ( int i = 0; i < (size * size) / 5; i++ )
      livingCellAt( random.nextInt( size ), random.nextInt( size ) );
    return this;
  }

  public void livingCellAt( int x, int y ) {
    array[ x ][ y ] = true;
  }

  public void deathCellAt( int x, int y ) {
    array[ x ][ y ] = false;
  }

  public boolean isCellAliveAt( int x, int y ) {
    return cellAliveAt( x, y ) == 1;
  }

  private int cellAliveAt( int x, int y ) {
    if ( x < 0 || y < 0 || x > array.length - 1 || y > array.length - 1 )
      return 0;
    return array[ x ][ y ] ? 1 : 0;
  }

  public int livingCellsAround( int x, int y ) {
    return cellAliveAt( x-1, y-1 ) + cellAliveAt( x, y-1 ) + cellAliveAt( x+1, y-1 ) + 
           cellAliveAt( x-1, y   ) +                       + cellAliveAt( x+1, y   ) +
           cellAliveAt( x-1, y+1 ) + cellAliveAt( x, y+1 ) + cellAliveAt( x+1, y+1 );
  }

  public Cells nextGeneration() {
    int size = array.length;
    Cells result = new Cells( size );
    for ( int x = 0; x < size; x++ )
      for ( int y = 0; y < size; y++ )
        nextGenerationAt( x, y, result );
    return result;
  }

  private void nextGenerationAt( int x, int y, Cells newArea ) {
    int  livingCellsAround = livingCellsAround( x, y );
    boolean isCellAlive    = isCellAliveAt( x, y );

    // Eine lebendige Zelle stirbt, wenn sie weniger als zwei lebendige Nachbarzellen hat.
    if ( isCellAlive && livingCellsAround < 2 )
      newArea.deathCellAt( x, y );

    // Eine lebendige Zelle mit mehr als drei lebenden Nachbarzellen stirbt im nächsten Zeitschritt.
    else if ( isCellAlive && livingCellsAround > 3 )
      newArea.deathCellAt( x, y );

    // Eine lebendige Zelle mit zwei oder drei lebendigen Nachbarn lebt weiter.
    else if ( isCellAlive && (livingCellsAround == 2 || livingCellsAround == 3) )
      newArea.livingCellAt( x, y );

    // Eine tote Zelle wird wiederbelebt, wenn sie genau drei lebende Nachbarzellen hat.
    else if ( ! isCellAlive && livingCellsAround == 3 )
      newArea.livingCellAt( x, y );
  }

  public void print() {
    for ( int y = 0; y < array.length; y++ ) {
      for ( int x = 0; x < array.length; x++ )
        System.out.print( isCellAliveAt( x, y ) ? "*" : " " );
      System.out.println();
    }
  }
}
