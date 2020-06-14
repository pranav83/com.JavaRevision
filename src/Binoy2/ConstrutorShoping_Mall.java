package Binoy2;

public class ConstrutorShoping_Mall {

    String shoppingCenter;
    String location;
    double distance;

    ConstrutorShoping_Mall() {

    }

    ConstrutorShoping_Mall(String name, double dist) {
        shoppingCenter = name;
        distance = dist;
    }

    ConstrutorShoping_Mall(String name, double d, String loc) {
        shoppingCenter = name;
        distance = d;
        location = loc;
    }

    ConstrutorShoping_Mall(String shoppingCenter, String location, double distance) {
        this.shoppingCenter = shoppingCenter;
        this.location = location;
        this.distance = distance;
    }

    public void dispaly1(String shoppingCenter, String location) {
        this.shoppingCenter =shoppingCenter;
        this.location = location ;
        System.out.println("The shopping center name is : "+shoppingCenter+" and the loction is : "+location);

    }
    public void display2(String shoppingCenter,String location,double distance){
        System.out.println("The shopping center name is : "+shoppingCenter);
        System.out.println("The location is : "+location);
        System.out.println("The distance is : "+distance+"miles");//appending
    }


}
