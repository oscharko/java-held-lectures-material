package com.tutego.insel.solutions.radio.v7;

class ElectricAppliance {

  private boolean isOn;

  public void on() {
    isOn = true;
  }

  public void off() {
    isOn = false;
  }

  boolean isOn() {
    return isOn;
  }

  @Override
  public String toString() {
    return "ElectricAppliance[Elektrogerät ist " + (isOn ? "an" : "aus") + "]";
  }
}

class DVDPlayer extends ElectricAppliance {
  int program;
}

class Radio extends ElectricAppliance {
  int volume;
}

public class ElectricAppliances {
  public static void main( String[] args ) {
    Radio radio = new Radio();
    radio.on();
    System.out.println( radio );
  }
}
