package com.HomeWork;

public class Alpha extends CoreQA {

    static String studentSubject;
    static int rollno;

    public Alpha(String studentName, String studentLevel, String mobile_No, String studentSubject, int rollno) {
        super(studentName, studentLevel, mobile_No, studentSubject, rollno);
    }

    public Alpha() {
        super();
    }

    public Alpha(String studentName, String studentLevel, String mobile_no, String studentSubject, int rollno, int subjectID) {

    }


    public void display() {
        super.display();
        System.out.println("Student Subject: " + studentSubject);
        System.out.println("Student RollNo: " + rollno);

    }
}
