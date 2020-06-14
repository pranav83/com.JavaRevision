package Demo;

public class Casting {
    public static void main(String[] args) {
/*
What is Casting?
Casting is converting variable and Object and data type
Object into another Object
Variable into another variable;
Casting produce new value

There are two type implicit casting and Explicit casting
It is also called widening casting and narrowing CastingC

 */

// Explicit Casting


// This is manual converting variable to variable casting
    double a = 150.99999;
    int b = (int) a;
        System.out.println(a);
        System.out.println(b);


 // This manual converting data type
        String val = "6565";//put numeric
        int x = Integer.parseInt(val);
        System.out.println(x);

        String A = "Pranav";
        String f = ".Pothiwala";
        String y = String.valueOf(A);
        String d = String.valueOf(x);
        String h = A+f;
        System.out.println(A);
        System.out.println(y);
        System.out.println(d);
        System.out.println(h);

//        Implicit Casting
        int q = 4; double e = 2.65; double result;
        result = (q + e);
//        Here result is double so Automatically int q will have decimal value like q = 4.00
        System.out.println(result);
//        Explicit Casting
        int result1 = (int) result;
        System.out.println(result1);



    }
}
