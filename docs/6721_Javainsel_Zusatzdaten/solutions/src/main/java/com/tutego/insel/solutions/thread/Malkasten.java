package com.tutego.insel.solutions.thread;

public class Malkasten {

  private int maxStifte;
  private int anzahlStifte;

  public Malkasten( int farbenZahl ) {
    maxStifte = farbenZahl;
    anzahlStifte = maxStifte;

    System.out.println( "Ich bin ein Malkasten mit " + anzahlStifte + " Stiften." );
  }

  public synchronized void nimmStifte( int anzahl ) {
    while ( anzahlStifte < anzahl ) {
      System.out.println( "gewuenscht: " + anzahl + ", vorhanden: " + anzahlStifte );
      try {
        wait();
      }
      catch ( InterruptedException e ) {
        e.printStackTrace();
      }
    }
    anzahlStifte -= anzahl;
  }

  public synchronized void legStifteZurueck( int anzahl ) {
    anzahlStifte += anzahl;

    if ( anzahlStifte > maxStifte ) {
      System.out.println( "Irgendjemand gibt zu viele Stifte zurueck!" );
      anzahlStifte = maxStifte;
    }

    notifyAll();
  }
}
