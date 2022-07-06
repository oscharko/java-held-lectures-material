package com.tutego.insel.solutions.radio.v2;

public class Radio {

  int volume;
  boolean isOn;

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
    return "Radio[volume=" + volume + " "
           + (isOn ? "Radio ist an." : "Radio ist aus.") + "]";
  }
}
