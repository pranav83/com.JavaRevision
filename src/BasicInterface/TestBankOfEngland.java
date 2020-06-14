package BasicInterface;

public class TestBankOfEngland {

    public static void main(String[] args) {

//        Barclays barclays = new Barclays();
//        System.out.println(barclays.rate_Of_Interest());

        Bank_Of_England bank;

        bank = new Barclays();
        System.out.println("This Barclays bank rate of interest: "+bank.rate_Of_Interest());

        bank = new Hdfc();
        System.out.println("This HDFC bank rate of interest: "+bank.rate_Of_Interest());

        bank = new Santander();
        System.out.println("This Santander bank rate of interest: "+bank.rate_Of_Interest());



    }
}
