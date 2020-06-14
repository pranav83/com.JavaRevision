package com.HomeWork;

public class CoreQA {

    String studentName;
    String studentLevel;
    String mobile_No;
    private int studentAge;

    public CoreQA(String studentName, String studentLevel, String mobile_no, String studentSubject, int rollno) {
    }

    public CoreQA(String studentName, String studentLevel, String mobile_no, String studentSubject, int rollno, int subjectID) {
    }

    public CoreQA() {

    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public CoreQA(String studentName, String studentLevel, String mobile_No) {
        this.studentName= studentName;
        this.studentLevel = studentLevel;
        this.mobile_No = mobile_No ;
    }
    public void display(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Level: "+studentLevel);
        System.out.println("Student Mobile_No: "+mobile_No);
        System.out.println("Student Age: "+studentAge);

    }
}