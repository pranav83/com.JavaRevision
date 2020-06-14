package Oops1;

public class PolyRunTriangle extends PolyRunGeomatry {

    double base, height;

    PolyRunTriangle(double base, double height ){
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        System.out.print(" Area of the triangle: ");
        return 0.5*base*height;
    }
}
