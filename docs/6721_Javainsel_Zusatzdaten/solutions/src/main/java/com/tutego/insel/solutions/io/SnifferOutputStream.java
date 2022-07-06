package com.tutego.insel.solutions.io;

import java.io.*;

public class SnifferOutputStream extends FilterOutputStream {
  
  private StringBuilder written = new StringBuilder( 1024 );

  public SnifferOutputStream( OutputStream out ) {
    super( out );
  }

  public void reset() {
    written = new StringBuilder( 1024 );
  }

  @Override
  public synchronized void write( int b ) throws IOException {
    out.write( b );
    written.append( (char) b );
  }

  public synchronized String getContent() {
    return written.toString();
  }

  public static void main( String[] args ) throws IOException {
    try ( SnifferOutputStream sos = new SnifferOutputStream( new FileOutputStream( "alois.txt" ) );
          DataOutputStream dos = new DataOutputStream( sos ) ) {
      dos.writeChars( "Hallo Leute\n" );
      dos.writeUTF( "Hallo Leute" );
      System.out.println( sos.getContent() );
    }
  }
}