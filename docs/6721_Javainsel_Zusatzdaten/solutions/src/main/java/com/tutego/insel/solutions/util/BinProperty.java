package com.tutego.insel.solutions.util;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class BinProperty extends Properties {

  public void putBin( String s, byte[] b ) {
    try {
      setProperty( s, URLEncoder.encode( new String( b ), StandardCharsets.UTF_8.name() ) );
    }
    catch ( UnsupportedEncodingException e ) {
      e.printStackTrace();
    }
  }

  public byte[] getBin( String key ) {
    String val = "";

    try {
      val = getProperty( URLDecoder.decode( key, StandardCharsets.UTF_8.name() ) );
    }
    catch ( Exception e ) {
      e.printStackTrace();
    }

    return val.getBytes();
  }

  public static void main( String[] args ) {
    BinProperty bin = new BinProperty();

    // rein

    byte[] bytes = "%d#ß?=)/".getBytes();

    bin.putBin( "Eins", bytes );

    // raus

    bytes = bin.getBin( "Eins" );

    System.out.println( bin.getProperty( "Eins" ) );

    System.out.println( Arrays.toString( bytes ) );
  }
}