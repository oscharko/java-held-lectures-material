package com.tutego.insel.solutions.oop.form;

public class Circle extends Form {

  protected double radius;

  public Circle( double x, double y, double radius ) {
    setX( x );
    setY( y );
    setRadius( radius );
  }

  public void setRadius( double radius ) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle[(x = " + x + ",y = " + y + ", Radius r = " + radius + ", Flaeche = " + area() + "]";
  }
}