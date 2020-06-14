package Binoy2;

public class DifferentVariableType {
    /*
    There are three type of variable
    static/class/local

    instance Var
    String name;
    int value;

     */
   static void square(int r){
        int result = r*r;
        System.out.println("Result of Square = "+result);
    }
    static void circle(int c){
       double result =  3.14*c*c;
        System.out.println("Result of Circle = "+result);
    }
    static void Triangle(int t){

       double result =t+t+t;
        System.out.println("Result of Triangle = "+result);

    }

    public static void main(String[] args) {
        DifferentVariableType.square(6);
        DifferentVariableType.circle(5);
        DifferentVariableType.Triangle(15);
    }
}
