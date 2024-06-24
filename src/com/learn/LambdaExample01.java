package com.learn;
interface Drawable02{
    void draw();
}
public class LambdaExample01 {

    public static void main(String[] args){

        int width = 10;

        Drawable02 d02 = () -> {

                System.out.println(" I am drawing " + width);

        };

        d02.draw();
    }

}
