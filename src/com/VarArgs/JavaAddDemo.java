package com.VarArgs;

public class JavaAddDemo {

    public void add(int...num){
       int sum = 0 ;
       for (int x : num ){
           sum = sum + x ;
       }
        System.out.println(sum);
    }
    public void minius(int...num){
        double sum = 0;
        for (int x : num){
            sum = sum - x ;
        }
        System.out.println(sum);
    }
}
