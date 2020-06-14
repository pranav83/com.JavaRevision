package Oops1;

public class InheritanceTest  {

    public static void main(String[] args) {

        InheritanceIndiaForm iif = new InheritanceIndiaForm();
        iif.fristName = "Neelraj";
        iif.lastName = " Pothiwala";
        iif.email = " npothiwala1@gmail.com";
        iif.mobileNo = 07445656556;
        iif.AdharCardNo =263255655;
        iif.displayIndiaFormInformation();
        iif.setAge(35);
        System.out.println("age is : "+  iif.getAge());



    }
}
