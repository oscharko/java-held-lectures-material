package com.tutego.insel.solutions.socke;

import java.awt.Color;

class StringToColor2
{
  private final static String[] COLOR_NAMES = {
      "rot", "gruen", "blau", "gelb"
  };
  private final static Color[] COLORS = {
      Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW
  };

  public static Color stringToColor( String s ) {
    for ( int i = 0; i < COLOR_NAMES.length; i++ )
      if ( COLOR_NAMES[ i ].equalsIgnoreCase( s ) )
        return COLORS[ i ];

    return Color.black;
  }
}
