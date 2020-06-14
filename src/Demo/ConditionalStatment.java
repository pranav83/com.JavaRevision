package Demo;

public class ConditionalStatment {
    public static void main(String[] args) {
        /*
        This all are conditional Operator
        == is equal to
        != is not equal to
        > is greater than
        < is less than
        >= is greater than or equal to
        <= is less than or equal to
         */
        int x = 10;
        if(x == 20){
//       == is comparision Operator
            System.out.println("Yes the value of x is 10");
        }
       else if (x >= 20) {
            System.out.println("X >= 10 ");
        }
       else {
            System.out.println("Value of x is 0");
        }
//       --------Logical Operator--------------
       int player1 = 40; int player2 = 60;
//       && is and operator  || is or Operator
       if ((player1 >= player2) || (player2 >= player1)) {
           System.out.println((player2>player1)+" Player is winner");
       }
       else {
           System.out.println("Student is Failed");
       }
       int Science = 56; int Maths = 45;
       int History = 40; int Geography = 40;
       int total_Score = Science + Maths + History + Geography;
       double Result;
       int total_Marks = 280;

       if((Science >=35) &&(Maths>=35)&&(History>=35)&&(Geography>=35)){

           Result = 100*total_Score/total_Marks;

           System.out.println("Student Passed with "+Result+" Percentage");
       }
       else {
           System.out.println("Student Failed");
       }
    }
}
