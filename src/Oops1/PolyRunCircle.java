package Oops1;

public class PolyRunCircle extends PolyRunGeomatry {
    double radius; // instance var --> constructor

    // create a constructor
    PolyRunCircle (double radius)
    { this.radius = radius; }

    @Override
    double area (){
        System.out.print(" Area of the circle : ");
        return (3.1489 * radius*radius);
    }
}
