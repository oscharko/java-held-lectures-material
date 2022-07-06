package com.tutego.insel.solutions.oop.form;

import java.util.Comparator;

public class FormComparator implements Comparator<Form> {
  @Override
  public int compare( Form f1, Form f2 ) {
    return Double.compare( f1.area(), f2.area() );
  }
}