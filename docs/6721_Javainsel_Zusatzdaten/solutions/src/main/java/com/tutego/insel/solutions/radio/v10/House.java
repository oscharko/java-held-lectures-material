package com.tutego.insel.solutions.radio.v10;

import java.util.ArrayList;
import java.util.Collections;

public class House {

  private ArrayList<ElectricAppliance> appliances = new ArrayList<>();

  public void add( ElectricAppliance appliance ) {
    appliances.add( appliance );
  }

  public ElectricAppliance findMostPowerConsumingAppliance() {
    return Collections.max( appliances, new ElectricApplianceWattComparator() );
  }
}