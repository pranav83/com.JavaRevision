package Demo;

import java.util.Arrays;

public class ArrayClass {
//    What is Array
//    Array is storing same type of data
    public static void main(String[] args) {

        int a[] = new int[] {49,57,11,12,89};
        System.out.println("This is traditional loop ");
       for (int i = 0; i < a.length; i++){
           System.out.println(" "+a[i]);

       }
        System.out.println("This is enhanced loop ");
       for (int i :a){
           System.out.println(i);
       }
        System.out.println("This converting array to Array string");
        System.out.println("By using Arrays to string "+ Arrays.toString(a));

}
}
