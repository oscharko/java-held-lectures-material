package com.tutego.insel.solutions.util;

import java.util.*;

public class WordFilter {

  private HashMap<String, String> hm = new HashMap<>();

  public void addWordPair( String find, String replace ) {
    if ( find != null && replace != null )
      hm.put( find, replace );
  }

  public String replace( String s ) {
    StringBuilder result = new StringBuilder( s.length() );

   for ( String token : s.split( "\\s+" ) ) {
      String substitution = hm.get( token );
      result.append( substitution == null ? token : substitution ).append( " " );
    }

    return result.toString().trim();
  }

  public static void main( String[] args ) {
    WordFilter wf = new WordFilter();
    wf.addWordPair( "doof", "unschlau" );
    wf.addWordPair( "pfusch", "unguenstig" );

    System.out.println( wf.replace( "Das Programm ist doof und das ist alles pfusch" ) );
  }
}