package Oops1;

public class InheritanceIndiaForm extends InheritanceTemplate{

    int mobileNo ;
    int AdharCardNo ;


    static String counrty = "India";

    void displayIndiaFormInformation(){
        displayTemplate();
        System.out.println("Mobile number is : "+mobileNo);
        System.out.println("Country is :"+counrty);
        System.out.println("Adhar card no is :"+AdharCardNo);

    }


}
