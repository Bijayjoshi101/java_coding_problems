package com.learn;

public class StringReverseSB {

    public static void main(String[] args){

        String originalString = "Happy Birthday";

        StringBuffer sb = new StringBuffer(originalString);

        String reverseString = sb.reverse().toString();

        System.out.println("The original String is : " + originalString);
        System.out.println("The reverse String is  : " + reverseString);
    }

}
