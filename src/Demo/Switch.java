package Demo;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        String Grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter your Grade ");
         Grade = scanner.nextLine();


        switch (Grade)
        {
            case "A++" :
                System.out.println("Excellent");
                break;
            case "A":
                System.out.println("Very Good");
                break;
            case "B++":
                System.out.println("Good");
                break;
            case "B":
                System.out.println("ok");
                break;
            default:
                System.out.println("The grade are not defined ");
                break;
        }
    }
}
