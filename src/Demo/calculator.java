package Demo;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first NO.");
       double x = scanner.nextDouble();
        System.out.println("Enter second No.");
        double y = scanner.nextDouble();
//        int x=10; int y =20;
        System.out.println("Answer is "+(x+y));
    }

}
