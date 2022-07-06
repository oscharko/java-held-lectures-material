package com.tutego.insel.solutions.array;

import javax.swing.*;
import java.util.*;

public class Anagrammtest {
  
  public static boolean istAnagramm( String s1, String s2 ) {
    char[] testArray1 = s1.toCharArray();
    char[] testArray2 = s2.toCharArray();

    Arrays.sort( testArray1 );
    Arrays.sort( testArray2 );

    return Arrays.equals( testArray1, testArray2 );
  }

  public static void main( String[] args ) {
    String s1 = JOptionPane.showInputDialog( "Bitte 1. String eingeben" );
    String s2 = JOptionPane.showInputDialog( "Bitte 2. String eingeben" );

    System.out.println( istAnagramm( s1, s2 ) );
  }
}