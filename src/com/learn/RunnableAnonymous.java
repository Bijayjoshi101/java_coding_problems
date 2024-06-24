package com.learn;
interface Drawable1{
    void draw();
}
public class RunnableAnonymous {

    public static void main(String[] args){

        Drawable1 d01 = new Drawable1() {
            public void draw() {
                System.out.println(" I am drawing");
            }
        };
        d01.draw();
    }

}
