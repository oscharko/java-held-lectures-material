package com.tutego.insel.solutions.radio.v8;

import java.util.ArrayList;

public class House {

  private ArrayList<ElectricAppliance> appliances = new ArrayList<>();

  public void add( ElectricAppliance appliance ) {
    appliances.add( appliance );
  }

  public void holiday() {
    for ( ElectricAppliance appliance : appliances )
      appliance.off();
  }
}