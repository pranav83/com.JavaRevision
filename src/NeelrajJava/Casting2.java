package NeelrajJava;

public class Casting2 {

    public static void main(String[] args) {

        double x = 12.34;
        int  y = (int) x;
        System.out.println(y);
        String d = String.valueOf(y);
        System.out.println(d);

        int a = 9; double b = 9.10;
        int result = (int) (a + b);
        System.out.println(result);
    }
}
