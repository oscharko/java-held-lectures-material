package com.tutego.insel.solutions.util;

import java.util.Locale;

public class RandomInEveryLocalePrinter {

  public static void main( String[] args ) {
    double random = 1_000_000 * Math.random();
    Locale[] locales = Locale.getAvailableLocales();
    for ( Locale locale : locales )
      System.out.printf( locale, "%,.3f (%s)%n", random, locale.getDisplayName() );
  }
}