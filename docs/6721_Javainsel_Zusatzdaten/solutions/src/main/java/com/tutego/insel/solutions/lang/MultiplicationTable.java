package com.tutego.insel.solutions.lang;

public class MultiplicationTable {

  public static void main( String[] args ) {

    printStartTable();

    for ( int i = 1; i <= 11; i++ ) {
      printStartRow();
      for ( int j = 1; j < 11; j++ ) {
        printTableDefinition( i * j );
      }
      printEndRow();
    }

    printEndTable();
  }

  private static void printStartTable() {
    System.out.println( "<table>" );
  }

  private static void printEndTable() {
    System.out.println( "</table>" );
  }

  private static void printStartRow() {
    System.out.println( "<tr>" );
  }

  private static void printEndRow() {
    System.out.println( "</tr>" );
  }

  private static void printTableDefinition( int i ) {
    System.out.println( "<td>" + i + "</td>" );
  }
}
