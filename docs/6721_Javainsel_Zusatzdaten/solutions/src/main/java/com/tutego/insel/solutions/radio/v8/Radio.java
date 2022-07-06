package com.tutego.insel.solutions.radio.v8;

public class Radio extends ElectricAppliance {

  public static final int FM = 1;
  public static final int AM = 0;

  private int band = FM;
  private double frequency;
  private int volume;

  public void setBand( int band ) {
    if ( (band == FM) || (band == AM) )
      this.band = band;
    else
      System.out.println( "Falsches Band !" );
  }

  public int getBand() {
    return band;
  }

  public double getFrequency() {
    return frequency;
  }

  void setFrequency( double newFrequency ) {
    if ( isOn )
      frequency = newFrequency;
  }

  void volume( int x ) {
    if ( isOn ) {
      volume += x;
      if ( volume > 100 )
        volume = 100;
      if ( volume < 0 )
        volume = 0;
    }
  }

  void volumeUp() {
    volume( 1 );
  }

  void leiser() {
    volume( -1 );
  }

  @Override
  public String toString() {
    return "Radio: Sender = " + frequency + " Lautstaerke = " + volume + " "
           + (isOn ? "Radio ist an." : "Radio ist aus.");
  }
}