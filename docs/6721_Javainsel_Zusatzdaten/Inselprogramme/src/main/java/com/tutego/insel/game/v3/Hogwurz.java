package com.tutego.insel.game.v3;

class Hogwurz {

  public static void main( String[] args ) {
    Player parry = new Player();
    parry.name = "Parry Hotter";
    System.out.printf( "%s trägt: %s%n", parry.name, parry.item ); 
    parry.carry( "Denkarium" );
    System.out.printf( "%s trägt: %s%n", parry.name, parry.item ); 
    parry.carry( "Das goldene Ei" );
    System.out.printf( "%s trägt: %s%n", parry.name, parry.item ); 
    System.out.println( parry.doesCarry( "Denkarium" ) );
    System.out.println( parry.doesCarry( "Stein der Weisen" ) );
    System.out.println( parry.doesCarry( "Denk" ) );
    System.out.println( parry.doesCarry( "Ei" ) );
  }
}