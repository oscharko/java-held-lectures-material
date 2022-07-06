package com.tutego.insel.solutions.radio.v3;

public class Radio {

  public enum Band {
    AM, FM
  }

  private int volume;
  private Band band = Band.AM;
  private double frequency;
  private boolean isOn;

  public void setBand( Band band ) {
    if ( band == null ) {
      System.err.println( "Band darf nicht null sein!" );
      return;
    }

    this.band = band;
  }

  public Band getBand() {
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

  void volumeDown() {
    volume( -1 );
  }

  void on() {
    isOn = true;
  }

  void off() {
    isOn = false;
  }

  boolean isOn() {
    return isOn;
  }

  @Override
  public String toString() {
    return "Radio[Sender = " + frequency + ", Lautstaerke = " + volume + " "
           + (isOn ? "Radio ist an" : "Radio ist aus") + ", Band: " + band + "]";
  }
}