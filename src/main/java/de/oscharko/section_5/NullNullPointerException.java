package de.oscharko.section_5;

import javax.swing.*;

public class NullNullPointerException {
    public static void main(String[] args) {
        java.awt.Point p = null;
        String s = "Hallo";
        int i = 12;
        if (s != null)
            System.out.println(s.length());
        else
            System.out.println("s == null");

        String input = JOptionPane.showInputDialog("Eingabe");
        if (input != null)
            System.out.println(input.length());
    }
}
