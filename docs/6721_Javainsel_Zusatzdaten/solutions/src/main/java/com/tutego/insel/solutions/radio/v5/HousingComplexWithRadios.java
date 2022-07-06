package com.tutego.insel.solutions.radio.v5;

import java.util.ArrayList;

class House {
  private ArrayList<Radio> radios = new ArrayList<>();

  //  List<Radio> getRadios() {
  //    return Collections.unmodifiableList( radios );
  //  }

  void addRadio( Radio radio ) {
    radios.add( radio );
  }

  int numberOfActiveRadios() {
    int result = 0;

    for ( Radio radio : radios )
      if ( radio.isOn )
        result++;

    return result;
  }

  @Override
  public String toString() {
    return "House[" + radios.toString() + "]";
  }
}

class Radio {
  boolean isOn;
}

public class HousingComplexWithRadios {

  public static void main( String[] args ) {
    House h1 = new House();
    Radio radio1 = new Radio();
    radio1.isOn = true;
    Radio radio2 = new Radio();
    radio2.isOn = true;
    Radio radio3 = new Radio();
    h1.addRadio( radio1 );
    h1.addRadio( radio2 );
    h1.addRadio( radio3 );
    System.out.println( h1 );
    System.out.println( h1.numberOfActiveRadios() ); // 2
  }
}
