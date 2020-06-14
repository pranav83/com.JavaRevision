package Demo1;

public class JavaString {
//    How we can manipulate String in different ways
public static void main(String[] args) {
    String hello = "Hello e World e";
    System.out.println(hello);
//    There some properties and function related to String
    int a = hello.length();
    System.out.println(a);
    String b = hello.toLowerCase();
    System.out.println(b);
    String c = hello.toUpperCase();
    System.out.println(c);
//    Change the letter on string
    System.out.println(hello.replace('e','a'));
//    Find index of character
    System.out.println(hello.indexOf("o"));


}
}
