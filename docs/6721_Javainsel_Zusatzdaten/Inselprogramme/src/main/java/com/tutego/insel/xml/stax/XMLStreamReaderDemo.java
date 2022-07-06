package com.tutego.insel.xml.stax;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XMLStreamReaderDemo {
  public static void main( String[] args ) {
    try ( Reader in = Files.newBufferedReader( Paths.get( "party.xml" ) ) ) {
      XMLStreamReader parser = XMLInputFactory.newInstance().createXMLStreamReader( in );
      dumpXml( parser );
    }
    catch ( IOException | XMLStreamException e ) {
      e.printStackTrace();
    }
  }
  
  private static void dumpXml( XMLStreamReader parser ) throws XMLStreamException {
    StringBuilder spacer = new StringBuilder();
    
    while ( parser.hasNext() ) {
      System.out.println( "Event: " + parser.getEventType() );

      switch ( parser.getEventType() ) {
        case XMLStreamConstants.START_DOCUMENT:
          System.out.println( "START_DOCUMENT: " + parser.getVersion() );
          break;
  
        case XMLStreamConstants.END_DOCUMENT:
          System.out.println( "END_DOCUMENT: " );
          break;
  
        case XMLStreamConstants.NAMESPACE:
          System.out.println( "NAMESPACE: " + parser.getNamespaceURI() );
          break;
  
        case XMLStreamConstants.START_ELEMENT:
          spacer.append( "  " );
          System.out.println( spacer + "START_ELEMENT: " + parser.getLocalName() );
  
          // Der Event XMLStreamConstants.ATTRIBUTE wird nicht geliefert!
          for ( int i = 0; i < parser.getAttributeCount(); i++ )
            System.out.printf( "%s  Attribut: %s = %s%n", spacer,
                               parser.getAttributeLocalName( i ),
                               parser.getAttributeValue( i ) );
          break;
  
        case XMLStreamConstants.CHARACTERS:
          if ( ! parser.isWhiteSpace() )
            System.out.println( spacer + "  CHARACTERS: " + parser.getText() );
          break;
  
        case XMLStreamConstants.END_ELEMENT:
          System.out.println( spacer + "END_ELEMENT: " + parser.getLocalName() );
          spacer.delete( 0, 3 );  // reduce spacer
          break;
      } // end switch
      parser.next();
    } // end while
    parser.close();
  }
}