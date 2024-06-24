package com.learn;

public interface InterfaceAnimal {

    void makeSound();


    public static void printName(){
        System.out.println(" I am Harry Potter");
    }

    default void displayAge(){
        System.out.println(" I am 24 years old");
    }

}
