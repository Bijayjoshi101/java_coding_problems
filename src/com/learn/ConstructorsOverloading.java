package com.learn;

public class ConstructorsOverloading {

    int age;
    String name;

    ConstructorsOverloading(){
        this.age = 0;
        this.name = null;
    }


    ConstructorsOverloading(String name){
        this.age = 0;
        this.name = name;
    }

    ConstructorsOverloading(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age );

    }


    public static void main(String[] args) {

        ConstructorsOverloading c = new ConstructorsOverloading();
        ConstructorsOverloading c1 = new ConstructorsOverloading("Shyam");
        ConstructorsOverloading c2 = new ConstructorsOverloading("Ram", 28);

        c.showDetails();
        c1.showDetails();
        c2.showDetails();
    }

}
