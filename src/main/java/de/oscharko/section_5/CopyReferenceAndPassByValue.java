package de.oscharko.section_5;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class CopyReferenceAndPassByValue {
    public static void main(String[] args) {
        int age = 50;
        int dogAge = age;
        System.out.println(dogAge);

        java.awt.Point p = new java.awt.Point();

        java.awt.Point q = p;

        p.x = 10;
        System.out.println(q.x);
        q.y = 20;
        System.out.println(p.y);

        System.out.println(p);
        printPoint(p);
        System.out.println(p);
        clearPoint(p);
        System.out.println(p);

        System.out.println(randomPoint());

        System.out.println(clearPoint2(p));
        System.out.println(p);
    }

    static void printPoint(java.awt.@NotNull Point p) {
        System.out.println(p.x);
        System.out.println(p.y);
        int swap = p.x;
        p.x = p.y;
        p.y = swap;
    }

    static void clearPoint(java.awt.Point p) {
        p = null;
    }

    static java.awt.@NotNull Point randomPoint() {
        java.awt.Point point = new java.awt.Point();
        point.setLocation(Math.random() * 10, Math.random() * 20);
        return point;
    }

    @Contract("_ -> param1")
    static java.awt.@NotNull Point clearPoint2(java.awt.@NotNull Point p) {
        p.x = p.y = 0;
        return p;
    }
}

