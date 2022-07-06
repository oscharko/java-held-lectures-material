package com.tutego.insel.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CompareIgnoreCase {
  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    /*final*/ boolean compareIgnoreCase = new Scanner( System.in ).nextBoolean();
    Comparator<String> c = (s1, s2) -> compareIgnoreCase ? 
                                         s1.trim().compareToIgnoreCase( s2.trim() ) :
                                         s1.trim().compareTo( s2.trim() );
    String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };
    Arrays.sort( words, c );
    System.out.println( Arrays.toString( words ) );
  }
}
