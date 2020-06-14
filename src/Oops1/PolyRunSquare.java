package Oops1;

public class PolyRunSquare extends PolyRunGeomatry {

    double side;

    PolyRunSquare ( double side){
        this.side = side;
    }
    @Override
    double area (){
        System.out.print(" Area of the square: ");
        return side *side ;
    }
}
