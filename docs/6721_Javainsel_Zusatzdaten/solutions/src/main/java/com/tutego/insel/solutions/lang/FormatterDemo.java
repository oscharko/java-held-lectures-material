package com.tutego.insel.solutions.lang;

import java.util.Calendar;
import java.util.Locale;

public class FormatterDemo
{
  public static void main( String[] args )
  {
    double d = 1234567.1234;
    Calendar c = Calendar.getInstance();

    System.out.printf( "%.2f%n", d );

    System.out.printf( "%,.2f%n", d );
    System.out.printf( Locale.GERMANY, "%,.2f%n", d );

    System.out.printf( Locale.GERMANY, "%,20.2f%n", d );

    System.out.printf( "%1$td/%1$tm/%1$tY%n", c );
  }
}