package com.tutego.insel.solutions.thread;

public class Kind extends Thread {
  private String name;
  private Malkasten malkasten;

  public Kind( String name, Malkasten malkasten ) {
    this.name = name;
    this.malkasten = malkasten;
  }

  @Override
  public void run() {
    for ( int i = 1; i < 5; i++ ) {
      int anzahlStifte = (int) (Math.random() * 10 + 1);

      malkasten.nimmStifte( anzahlStifte );

      System.out.println( name + " hat beim " + i + ". Mal " + anzahlStifte + " Stifte geholt." );

      try {
        Thread.sleep( (long) (Math.random() * 3000) );
      }
      catch ( InterruptedException e ) {
        e.printStackTrace();
      }

      malkasten.legStifteZurueck( anzahlStifte );

      System.out.println( name + " hat beim " + i + ". Mal " + anzahlStifte
                          + " Stifte zurueckgegeben." );

      try {
        Thread.sleep( (int) (Math.random() * 2000) );
      }
      catch ( InterruptedException e ) {
        e.printStackTrace();
      }
    }
  }
}