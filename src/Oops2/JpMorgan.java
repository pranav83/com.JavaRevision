package Oops2;

public class JpMorgan extends BarclaysBank {
    @Override
    void cashWithDrawl() {
        System.out.println("This is cash Withdraw: ");
    }

    @Override
    void cashWithDeposits() {
        System.out.println("This is Deposits: ");
    }
}
