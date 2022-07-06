package com.tutego.insel.solutions.util;

import java.util.ArrayDeque;
import java.util.Deque;

public class UPN {
  public static void main( String[] args ) {
    String input = "12 50 32 + /";
    Deque<Double> deque = new ArrayDeque<>();

    for ( String token : input.split( "\\s+" ) ) {
      switch ( token ) {
        case "+":
          deque.addLast( deque.pollLast() + deque.pollLast() );
          break;
        case "-":
          deque.addLast( deque.pollLast() - deque.pollLast() );
          break;
        case "*":
          deque.addLast( deque.pollLast() * deque.pollLast() );
          break;
        case "/":
          deque.addLast( deque.pollLast() / deque.pollLast() );
          break;
        default :
          if ( token.matches( "\\d+" ) )
            deque.addLast( Double.parseDouble( token ) );
          else
            System.out.println( "Unbekannter Typ!" );
          break;
      }
    }
    System.out.printf( "Ergebnis: %.2f", deque.getFirst() );
  }
}