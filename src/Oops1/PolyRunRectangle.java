package Oops1;

public class PolyRunRectangle extends PolyRunGeomatry {

    double height, length;

    PolyRunRectangle (double height, double length ){

        this.height = height;
        this.length = length;
    }

    @Override
    double area (){
        System.out.print(" Area of the rectangle : ");
        return height * length;
    }
}
