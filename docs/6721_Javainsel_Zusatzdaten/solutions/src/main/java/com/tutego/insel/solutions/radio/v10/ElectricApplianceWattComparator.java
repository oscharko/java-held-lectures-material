package com.tutego.insel.solutions.radio.v10;

import java.util.Comparator;

public class ElectricApplianceWattComparator implements Comparator<ElectricAppliance> {

  // Zugriff über ElectricApplianceWattComparator.INSTANCE
  public static final Comparator<ElectricAppliance> INSTANCE = new ElectricApplianceWattComparator();

  //  private ElectricApplianceWattComparator() { }

  @Override
  public int compare( ElectricAppliance o1, ElectricAppliance o2 ) {
    System.out.println( o1 + " wird vergleichen mit " + o2 );
    return Double.compare( o1.getWatt(), o2.getWatt() );
  }
}