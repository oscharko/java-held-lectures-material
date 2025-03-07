package com.tutego.insel.xml.jdom.xpath;

import java.util.List;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.*;

public class XPathDemo1 {
  public static void main( String[] args ) throws Exception {
    Document doc = new SAXBuilder().build( "party.xml" );
    XPathExpression<Object> xpath = XPathFactory.instance().compile( "/party/gast/@name" );
    List<Object> names = xpath.evaluate( doc );
    names.stream().map( Attribute.class::cast ).map( Attribute::getValue ).forEach( System.out::println );
  }
}