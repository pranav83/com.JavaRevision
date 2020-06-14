package Binoy2;

public class Method1 {
    String studentName;
    String mobileNumber;
    double courseFees;

    void display(){
        System.out.println("Student Name "+studentName);
        System.out.println("Mobile Number "+mobileNumber);
        System.out.println("Course Fees "+courseFees);
    }
    String productName;
    double productPrice;
    String productID;
    void display(String productName ,double productPrice,String productID){
        System.out.println("Product Name = "+productName);
        System.out.println("Product Price = £"+productPrice);
        System.out.println("Product ID = "+productID);
    }
    double circle1(double radius){
        return (3.1467*radius*radius);
    }
}
