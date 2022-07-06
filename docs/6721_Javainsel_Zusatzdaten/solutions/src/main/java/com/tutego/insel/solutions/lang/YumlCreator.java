package com.tutego.insel.solutions.lang;

public class YumlCreator {

  public static void visitType( Class<?> clazz ) {

    if ( clazz.getSuperclass() != null ) {
      System.out.printf( "[%s]-^[%s]%n",
                         clazz.getSimpleName(),
                         clazz.getSuperclass().getSimpleName() );
  
      visitType( clazz.getSuperclass() );
    }

    for ( Class<?> interfaze : clazz.getInterfaces() ) {
      System.out.printf( "[%s]-^[<<interface>>;%s]%n",
                         clazz.getSimpleName(),
                         interfaze.getSimpleName() );
      visitType( interfaze );
    }
  }

  public static void main( String[] args ) throws ClassNotFoundException {
    Class<?> clazz = Class.forName( "javax.swing.JButton" );
    visitType( clazz );
  }
}
