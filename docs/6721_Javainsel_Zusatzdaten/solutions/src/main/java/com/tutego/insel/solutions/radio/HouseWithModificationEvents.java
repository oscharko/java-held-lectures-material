package com.tutego.insel.solutions.radio  ;

import java.util.*;
import javax.swing.event.EventListenerList;

public class HouseWithModificationEvents {

  public static void main( String[] args ) {
    House bude = new House();
    ElectricAppliance radio = new DVDPlayer();
    ElectricAppliance tv = new TV();
    bude.addModificationListener( e -> System.out.println( "Neues Element" ) );
    bude.add( radio ); // Meldung vom Listener
    bude.add( tv ); // Meldung vom Listener

  }
}

class ModificationEvent extends EventObject {
  public ModificationEvent( Object source ) {
    super( source );
  }
}

interface ModificationListener extends EventListener {
  void onModify( ModificationEvent e );
}

class House {
  private ArrayList<ElectricAppliance> appliances = new ArrayList<>();
  private EventListenerList listeners = new EventListenerList();

  void add( ElectricAppliance e ) {
    appliances.add( e );

    // Alle Interessenten benachrichtigen
    for ( ModificationListener listener : listeners.getListeners( ModificationListener.class ) ) {
      ModificationEvent event = new ModificationEvent( this );
      listener.onModify( event );
    }
  }

  public void addModificationListener( ModificationListener listener ) {
    listeners.add( ModificationListener.class, listener );
  }
}

class ElectricAppliance {
}

class DVDPlayer extends ElectricAppliance {
}

class TV extends ElectricAppliance {
}