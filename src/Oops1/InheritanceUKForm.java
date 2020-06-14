package Oops1;

public class InheritanceUKForm extends InheritanceTemplate{

    int mobileNo ;

    static String counrty = "United Kingdom";

    void displayUkFormInformation(){
        displayTemplate();
        System.out.println("Mobile number is : "+mobileNo);
        System.out.println(counrty);
    }


}
