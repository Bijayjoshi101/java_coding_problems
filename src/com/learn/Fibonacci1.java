package com.learn;

public class Fibonacci1 {

    public static void main(String[] args) {

        int n = 10;
        int a = 0, b = 1;

        System.out.print(" Fibonacci numbers are " + a + " " + b + " ");

        for(int i =0; i<n-2; i++){
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

    }

}
