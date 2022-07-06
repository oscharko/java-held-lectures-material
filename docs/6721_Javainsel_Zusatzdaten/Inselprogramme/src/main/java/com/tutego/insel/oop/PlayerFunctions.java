package com.tutego.insel.oop;
class PlayerFunctions {

  static void carry( PlayerData data, String newItem ) {
    if ( newItem != null && !newItem.trim().isEmpty() )
      data.item += newItem + ";";
  }

  static boolean doesCarry( PlayerData data, String anItem ) {
    if ( anItem == null )
      return false;
    return (";" + data.item).contains( ";" + anItem + ";" );
  }
}
