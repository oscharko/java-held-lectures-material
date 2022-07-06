package com.tutego.insel.solutions.radio.v4;

class MonitorTube {

  private boolean isOn;

  public void on() {
    isOn = true;
    System.out.println( "Bildröhre ist an." );
  }

  public void off() {
    isOn = false;
    System.out.println( "Bildröhre ist aus." );
  }

  @Override
  public String toString() {
    return String.format( "Bildröhre[eingeschaltet=%s]", isOn );
  }
}

class TV {

  private int program;
  private boolean isOn;
  private MonitorTube tube = new MonitorTube();

  public void setProgram( int program ) {
    this.program = program;
  }

  public void on() {
    isOn = true;
    System.out.println( "TV ist an." );
    tube.on();
  }

  public void off() {
    isOn = false;
    System.out.println( "TV ist aus." );
    tube.off();
  }

  @Override
  public String toString() {
    return String.format( "TV[program=%s, eingeschaltet=%s]", program, isOn );
  }
}

public class TVWithMonitorTube {

  public static void main( String[] args ) {
    TV tv = new TV();
    tv.setProgram( 21 );
    tv.on();
    tv.off();
  }
}