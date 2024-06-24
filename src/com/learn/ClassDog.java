package com.learn;

public class ClassDog implements InterfaceAnimal{

    public void makeSound(){
        System.out.println(" I am making sound");
    }

    public static void main(String[] args){
        InterfaceAnimal a01 = new ClassDog();
        a01.makeSound();
    }

}
