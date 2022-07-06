package com.tutego.insel.solutions.socke.v1;

class Socke {

  String farbe;
  boolean istTrocken;

  void trockne() {
    istTrocken = true;
  }

  void wasche() {
    istTrocken = false;
  }

  boolean istTrocken() {
    return istTrocken;
  }
}
