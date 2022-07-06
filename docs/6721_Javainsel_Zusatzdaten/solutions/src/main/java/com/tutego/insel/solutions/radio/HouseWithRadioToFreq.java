package com.tutego.insel.solutions.radio;

class Radiostations {
  public static final String BFBS_STATION_NAME = "bfbs";
  public static final double BFBS_FREQUENCY = 103.;
}

class Radio {
  public static double toFreq( String frequency ) {

    if ( frequency == null )
      return 0.0;

    switch ( frequency.trim().toLowerCase() ) {

      case "wdr 1":
        return 101.;

      case Radiostations.BFBS_STATION_NAME:
        return Radiostations.BFBS_FREQUENCY;

      default :
        return 0.;
    }
  }
}

public class HouseWithRadioToFreq {

  public static void main( String[] args ) {
    System.out.println( Radio.toFreq( "BFBS" ) ); // 103.0
  }
}