package com.tutego.insel.solutions.util;

import java.util.Arrays;
import java.util.Comparator;

class AdressComparator implements Comparator<Address> {

  @Override
  public int compare( Address a1, Address a2 ) {
    int cityCompareTo = a1.getCity().compareTo( a2.getCity() );

    if ( cityCompareTo == 0 )
      return a1.getPlz() < a2.getPlz() ?
               -1 :
               (a1.getPlz() == a2.getPlz() ? 0 : 1);

    return cityCompareTo;
  }

  public static void main( String[] args ) {
    Address[] addresses = {
        new Address( "Immengarten 6", "Hannover", 30177 ),
        new Address( "Petzelstrasse 84", "Langenhagen", 30855 ),
        new Address( "Friedrichswall 11", "Hannover", 30159 )
    };

    Arrays.sort( addresses, new AdressComparator() );

    for ( Address a : addresses )
      System.out.println( a );
  }
}