package com.tutego.insel.solutions.util;

import java.util.*;

public class SetDemo {
  
  public static void main( String[] args ) {
    TreeSet<String> baumSatz = new TreeSet<>();
    HashSet<Object> hashSatz = new HashSet<>();

    String[] vieleWorte = {
        "möchtest", "du", "wertvolle", "dinge", "sehen", "so", "blicke", "dorthin", ",", "wohin",
        "die", "große", "menge", "nicht", "sieht"
    };

    baumSatz.addAll( Arrays.asList( vieleWorte ) );
    hashSatz.addAll( Arrays.asList( vieleWorte ) );

    System.out.println( "baumSatz: " + baumSatz );
    System.out.println( "hashSatz: " + hashSatz );

    baumSatz.add( "so" );
    hashSatz.add( "so" );

    // baumSatz.add( new Date() ); // java.lang.ClassCastException: java.lang.String
    hashSatz.add( new Date() ); // O.K. in einem Hashset, da es keine Vergleiche gibt
  }
}