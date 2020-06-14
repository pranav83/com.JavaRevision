package NeelrajJava;

import java.util.Scanner;

public class My_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plz enter 1st no:");
        String x  = scan.next();
        System.out.println("Plz enter 2nd no:");
        String y = scan.next();

        System.out.println(" Answer = " + x +" "+ y);
    }
}
