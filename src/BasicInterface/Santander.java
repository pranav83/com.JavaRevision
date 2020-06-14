package BasicInterface;

public class Santander implements Bank_Of_England {
    @Override
    public double rate_Of_Interest() {
        //System.out.print("This is Barclays Bank rate of interest: ");
        return 1.45;
    }
}
