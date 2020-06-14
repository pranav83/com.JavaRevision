package Oops1;

public class Encap {

    String furitName ;
    private double price ;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    void display(){
        System.out.println("Name of the fruit is "+furitName+" and the price is £"+price+" per box");
    }
    void display1(){
        System.out.println("Name ");
    }
}
