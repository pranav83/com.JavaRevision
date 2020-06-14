package com.HomeWork;

public  class CoreQaTest  {

    public static void main(String[] args) {

        CoreQA cqa = new CoreQA("Pranav","Medium","07411759129");
        cqa.setStudentAge(35);
        cqa.display();

        System.out.println("***************************************************************************************");

        Alpha alpha = new Alpha();
        alpha.setStudentAge(16);
        alpha.studentName = "Neelraj";
        alpha.studentLevel = "High";
        alpha.mobile_No = "07411759129";
        alpha.studentSubject = "C.S";
        alpha.rollno = 49;
        alpha.display();

        System.out.println("*******************************************************************************************");

        Alpha beta = new Alpha();
        beta.setStudentAge(25);
        beta.studentName = "Ramesh";
        beta.studentLevel = "Low";
        beta.mobile_No = "07959465845";
        beta.studentSubject = "xyz";
        beta.rollno = 29;
        Beta.subjectID = 5;
        beta.display();

    }
}
