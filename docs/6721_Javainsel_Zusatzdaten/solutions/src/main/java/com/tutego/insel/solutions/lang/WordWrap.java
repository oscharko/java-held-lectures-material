package com.tutego.insel.solutions.lang;

import java.util.*;

public class WordWrap {

  public static String wrapWord( String s, int len ) {
    String result = "";
    String line = "";

    StringTokenizer st = new StringTokenizer( s );

    while ( st.hasMoreTokens() ) {
      String t = st.nextToken();

      if ( (line.length() + t.length()) <= len )
        line += t + " ";
      else {
        result += line + "\n";
        line = t + " ";
      }
    }

    return result + line;
  }

  public static void main( String[] args ) {
    String s = "Der Sehnsucht entgegen, sie erleben. Wer kann das schon. Den Träumen entgegen,"
               + "sie erleben. Wer macht das schon. Den Gefühlen entgegen, sie erleben. Wer wagt das schon."
               + "Der Liebe entgegen, sie erleben. Wer darf das schon.";

    System.out.println( wrapWord( s, 30 ) );
  }
}