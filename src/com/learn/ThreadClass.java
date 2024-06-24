package com.learn;

public class ThreadClass extends Thread{

    public void run(){
        System.out.println(" I am running");
    }

    public static void main(String[] args){

        ThreadClass t = new ThreadClass();
        t.start();
    }

}
