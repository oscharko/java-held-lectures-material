package com.tutego.insel.solutions.radio.v2;

public class HousingComplex {
  public static void main( String[] args ) {
    Radio omisAltesRadio = new Radio();
    omisAltesRadio.on();
    omisAltesRadio.volumeUp();
    omisAltesRadio.volumeUp();
    System.out.println( omisAltesRadio.toString() );
    omisAltesRadio.off();
  }
}