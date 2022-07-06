package com.tutego.insel.solutions.xml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XmlHasImgTagWithAltAttribute {

  public static void main( String[] args ) {
    try ( InputStream is = Files.newInputStream( Paths.get( "" ) ) ) {
      for ( XMLStreamReader parser = XMLInputFactory.newInstance().createXMLStreamReader( is );
              parser.hasNext();
              parser.next() ) {
        final boolean isStartElement = parser.getEventType() == XMLStreamConstants.START_ELEMENT;
        final boolean isImgTag = "img".equalsIgnoreCase( parser.getLocalName() );
        if ( isStartElement && isImgTag && !containsAltTag( parser ) )
          System.err.println( "Does not contain alt tag!" );
      }
    }
    catch ( IOException | XMLStreamException e ) {
      e.printStackTrace();
    }
  }

  private static boolean containsAltTag( XMLStreamReader parser ) {
    for ( int i = 0; i < parser.getAttributeCount(); i++ )
      if ( "alt".equalsIgnoreCase( parser.getAttributeLocalName( i ) ) )
        return true;

    return false;
  }
}
