package com.learn;

public class ClassDog implements InterfaceAnimal{

    public void makeSound(){
        System.out.println(" I am making sound");
    }

    @Override
    public void displayAge(){
        System.out.println(" I am displaying the full age");
    }

    public static void main(String[] args){
        InterfaceAnimal a01 = new ClassDog();
        a01.makeSound();

        InterfaceAnimal.printName();
        a01.displayAge();
    }



}
