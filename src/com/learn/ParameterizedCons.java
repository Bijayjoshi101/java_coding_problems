package com.learn;

public class ParameterizedCons {
    int age;
    String name;
    ParameterizedCons(int a, String b){
        age = a ;
        name = b;
    }

    void displayInfo(){
        System.out.println(" Age : " + age);
        System.out.println(" Name : " + name);
    }

    public static void main(String[] args){
        ParameterizedCons c = new ParameterizedCons(2,"Ramesh");
        c.displayInfo();
    }

}
