package Demo1;

public class MethodClass {
/*    Interview Question what is Method
  What is Method ?
  Method are also called Functions
  Method is piece of code which execute some logic
  and we can call the method when it is necessary
  The name of the method should be relative
  Method has Acesses Modifier
  Method can be abstract
  Method can be parameterized
 */
public static int myFirstMethod(){
    System.out.println("Hello Friends how r u ");
    return 0;
}
public static void parmeterized_Method(){

}
public static void main(String[] args) {
    int[] a = new int[myFirstMethod()];

    myFirstMethod();
//    for (int i =0; i<5;i++){
//        myFirstMethod();
//    }
    for (int i : a){
        myFirstMethod();
    }
}
}
