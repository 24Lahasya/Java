package com.demo;

public class ThrowsAndThrow {
    public int add(int x,int y){return x+y;    }

    public int div(int x,int y)throws ArithmeticException{
        return x/y;

    }
    public static void main(String[] args) {
        ThrowsAndThrow t1 = new ThrowsAndThrow();
        try{
            System.out.println("adding 13 and 8" + t1.add(13,8));
            System.out.println("dividing 13 and 0" + t1.div(13,0));
        } catch (ArithmeticException z){
            System.out.println(z.getMessage());
        }
    }
}