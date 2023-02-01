package com.demo;
interface Drawable{
    void draw();
}
 class Rectangle implements Drawable {
     public void draw() {
         System.out.println("rectangle");
     }
 }
class  circle implements Drawable {
    public void draw() {
        System.out.println("circle");
    }
}
class TestInterface{
    public static void main(String[] args){
        Drawable d=new circle();
        d.draw();
        Drawable d1=new Rectangle();
        d1. draw();
    }
}



