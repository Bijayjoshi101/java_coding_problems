package com.learn;

public class FactorialRecursion {

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args){
        int n = 8;

        System.out.println("The factorial of " + n + " is " + factorial(n));
    }

}
