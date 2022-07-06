package com.tutego.insel.solutions.util;

import java.util.HashMap;
import java.util.Map;

public class WordCounter
{
  private Map<String, Integer> map = new HashMap<>();
  
  public void update( String s )
  {
    map.put( s, getWordCount( s ) + 1 );
    
//    Integer i = map.get( s );
//
//    if ( i == null )
//      map.put( s, 1 );
//    else
//      map.put( s, i++ );    
  }

  public void clear()
  {
    map.clear();
  }

  int getWordCount( String s )
  {
    Integer i = map.get( s );
    
    return i == null ? 0 : i;
  }
}