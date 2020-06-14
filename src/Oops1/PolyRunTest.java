package Oops1;

public class PolyRunTest {

    public static void main(String[] args) {

//        PolyRunCircle obj1 = new PolyRunCircle(3);
//        PolyRunRectangle obj2 =new PolyRunRectangle(5,6);
//        PolyRunSquare obj3 = new PolyRunSquare(4);
//        PolyRunTriangle obj4 = new PolyRunTriangle(5,9);
//
//        System.out.println(obj1.area());
//        System.out.println(obj2.area());
//        System.out.println(obj3.area());
//        System.out.println(obj4.area());

//        PolyRunGeomatry circle = new PolyRunCircle(3);
//        PolyRunGeomatry rectangle = new PolyRunRectangle(4,6);
//        PolyRunGeomatry square = new PolyRunSquare(5);
//        PolyRunGeomatry triangle = new PolyRunTriangle(6,3);
//
//        System.out.println(circle.area());
//        System.out.println(rectangle.area());
//        System.out.println(square.area());
//        System.out.println(triangle.area());


        PolyRunGeomatry[] a = new PolyRunGeomatry[4];

        a[0]=new PolyRunCircle(3);
        a[1]=new PolyRunRectangle(5,6);
        a[2]=new PolyRunSquare(4);
        a[3]=new PolyRunTriangle(6,4);

        for (PolyRunGeomatry i : a){
            System.out.println(i.area());
        }
//        for (int i =0; i<a.length;i++){
//            System.out.println(a[i].area());
//      }
    }
}
