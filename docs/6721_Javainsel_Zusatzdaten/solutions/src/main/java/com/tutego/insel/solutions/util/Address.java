package com.tutego.insel.solutions.util;

public class Address {

  private String street;
  private String city;
  private int plz;

  public Address() {
  }

  public Address( String city, String street, int plz ) {
    this.city = city;
    this.street = street;
    this.plz = plz;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet( String street ) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity( String city ) {
    this.city = city;
  }

  public int getPlz() {
    return plz;
  }

  public void setPlz( int plz ) {
    this.plz = plz;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((city == null) ? 0 : city.hashCode());
    result = prime * result + plz;
    result = prime * result + ((street == null) ? 0 : street.hashCode());
    return result;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj )
      return true;
    if ( obj == null )
      return false;
    if ( getClass() != obj.getClass() )
      return false;
    Address other = (Address) obj;
    if ( city == null ) {
      if ( other.city != null )
        return false;
    }
    else if ( !city.equals( other.city ) )
      return false;
    if ( plz != other.plz )
      return false;
    if ( street == null ) {
      if ( other.street != null )
        return false;
    }
    else if ( !street.equals( other.street ) )
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Address[" + street + ", " + city + ", " + plz + "]";
  }
}