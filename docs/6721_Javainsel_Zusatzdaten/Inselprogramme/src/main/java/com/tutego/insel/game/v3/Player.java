package com.tutego.insel.game.v3;

class Player {

  String name = "";
  String item = "";

  void carry( String newItem ) {
    if ( newItem != null && !newItem.trim().isEmpty() )
      item += newItem + ";";
  }

  boolean doesCarry( String anItem ) {
    if ( anItem == null )
      return false;
    return (";" + item).contains( ";" + anItem + ";" );
  }
}