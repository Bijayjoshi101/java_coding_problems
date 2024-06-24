package com.learn;

public class RunnableInterface implements Runnable{

    public void run(){

        System.out.println(" The Runnable is running");
    }

    public static void main(String[] args){

//        RunnableInterface r01 = new RunnableInterface();
        Thread t01 = new Thread(new RunnableInterface());
        t01.start();

    }

}
