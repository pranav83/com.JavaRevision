package Demo;

public class LoopClass {
    public static void main(String[] args) {

        int a = 0; int c=0;
        while (c<10){
            System.out.println(c);
            c++;
        }
        System.out.println("------------------------------------------------------------------");
        while (a<10){
            a++;
            System.out.println(a);
            a++;
        }
        System.out.println("--------------------------------------");
        int b =1;
        while (b<10){
            b++;
            System.out.println(b);
            b++;
        }
        System.out.println("-----------------------------------------------------------");
        int x = 0;
        do {
            System.out.println(x);
            x++;
        }while (x<-1);
    }
}
