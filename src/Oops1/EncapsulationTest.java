package Oops1;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation mango = new Encapsulation();
        mango.setFruitname("Kesar");
        mango.setPrice(80);
        mango.setFruitExport("India");

        System.out.println(mango.getFruitname());
        System.out.println(mango.getPrice());
        System.out.println(mango.getFruitExport());

        System.out.println("The name of fruit is "+mango.getFruitname()+" the price is "+mango.getPrice()+" is exported from "+mango.getFruitExport());


    }
}
