package de.oscharko.section_5;

public class OopNew {
    public static void main( String[] args ) {

        System.out.println(new java.awt.Point());
        java.awt.Point p = new java.awt.Point();
        java.awt.Point q;
        q = new java.awt.Point();

        p.x = 10;
        System.out.println(p.x);
        System.out.println(p.y);

        System.out.println(q.x);
        System.out.println(q.y);

        p.setLocation( 11, 22 );
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(p);
        System.out.println(q);

        String s = p.toString();
        System.out.println(s.length());
        // ->
        System.out.println(p.toString().length());
        //                 ------------ => String

        System.out.println(new java.awt.Point().toString().length());

        // Referenztyp             Objekttyp
        java.awt.Polygon polygon = new java.awt.Polygon();

//    java.awt.Point a = new java.awt.Polygon();
//    long a = new java.awt.Polygon();
    }
}
