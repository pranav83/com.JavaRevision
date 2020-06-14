package Oops2;

public class BNPParibas extends BarclaysBank {
    @Override
    void cashWithDrawl() {

        System.out.println("Cash");

    }

    @Override
    void cashWithDeposits() {
        System.out.println("Deposit");

    }
}
