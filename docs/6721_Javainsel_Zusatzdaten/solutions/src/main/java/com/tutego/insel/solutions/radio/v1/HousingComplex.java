package com.tutego.insel.solutions.radio.v1;

public class HousingComplex {

  public static void main( String[] args ) {
    Radio omisAltesRadio = new Radio();
    omisAltesRadio.isOn = true;
    omisAltesRadio.volume = 12;

    System.out.println( "So laut: " + omisAltesRadio.volume );
  }
}