package com.tutego.insel.solutions.radio.v8;

public class ElectricAppliance {

  boolean isOn;
  private double watt;

  public double getWatt() {
    return watt;
  }

  public void setWatt( double watt ) {
    this.watt = watt;
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

  // Aufruf:
  // Radio r1 = new ...
  // ElectricAppliance r2 = new ...
  // ElectricAppliance dvd = new ...
  // int i = ElectricAppliance.numberOfActiveAppliances( r1, dvd, r2 ); // i = 2
  public static int numberOfActiveAppliances( ElectricAppliance... appliances ) {
    int result = 0;

    for ( ElectricAppliance appliance : appliances )
      if ( appliance.isOn )
        result++;
    
    return result;
  }
}