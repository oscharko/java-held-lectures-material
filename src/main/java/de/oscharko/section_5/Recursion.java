package de.oscharko.section_5;

public class Recursion {
    public static void main(String[] args) {
        down1(10);
        System.out.println();
        down2(10);
    }

    static void down1(int n) {
        if (n <= 0) // Rekursionsende
            return;
        System.out.print(n + ", ");
        down1(n - 1);
    }

    static void down2(int n) {
        if (n <= 0) // Rekursionsende
            return;
        down2(n - 1);
        System.out.print(n + ", ");
    }
}
