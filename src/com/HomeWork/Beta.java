package com.HomeWork;


public class Beta extends CoreQA {

    public static int subjectID;

    public Beta(String studentName, String studentLevel, String mobile_no, String studentSubject, int rollno,int subjectID) {
        super(studentName, studentLevel, mobile_no, studentSubject, rollno,subjectID);
    }

    public Beta() {

    }


    public void display(){
        super.display();
        System.out.println("Subject ID: "+subjectID);

    }
}
