package Demo1;



import java.math.BigDecimal;
import java.util.Scanner;

public class MethodClass2 {


    //    Here we are going to create Parameterized Method now which i reusable
    public static void enterName(String name) {
        System.out.println("Name enter is " + name);
    }

    public static void enterNo(int no) {
        System.out.println("Lucky No. is " + no);
    }
//    Now we are creating reusable calculator Method
public static void main(String[] args) {

}
    public static void calCulator( ){
        double a =0; double b = 0; String c; BigDecimal result = null;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Operator");
        c= scanner.next();

        switch (c){
            case "+":
                System.out.println("Enter no. 1");
                a= scanner.nextDouble();
                System.out.println("Enter no. 2");
                b= scanner.nextDouble();
               result = BigDecimal.valueOf((a +b));
                System.out.println("Result ="+result);
                break;
            case "-":
                System.out.println("Enter no. 1");
                a= scanner.nextDouble();
                System.out.println("Enter no. 2");
                b= scanner.nextDouble();
                result = BigDecimal.valueOf((a-b));
                System.out.println("Result ="+result);
                break;
            case "x":
                System.out.println("Enter no. 1");
                a= scanner.nextDouble();
                System.out.println("Enter no. 2");
                b= scanner.nextDouble();
                result = BigDecimal.valueOf((a * b));
                System.out.println("Result ="+result);
                break;
            case "/":
                System.out.println("Enter no. 1");
                a= scanner.nextDouble();
                System.out.println("Enter no. 2");
                b= scanner.nextDouble();
                result = BigDecimal.valueOf((a / b));
                System.out.println("Result ="+result);
                break;
            case "%":
                System.out.println("Enter no. 1");
                a= scanner.nextDouble();
                System.out.println("Enter no. 2");
                b= scanner.nextDouble();
                result = BigDecimal.valueOf((a % b));
                System.out.println("Result ="+result);
                break;
            default:
                System.out.println("Operator not found");

        }
    }

//    public static void main(String[] args) {
//        enterName("Pranav");
//        enterNo(29);
//        enterName("Manun");
//        enterNo(30);
//        enterName("Jayanta");
//        enterNo(31);
//        enterName("Samir");
//        enterNo(32);
//        enterName("Binoy");
//        enterNo(33);
//       // calCulator();
//
//    }
}
