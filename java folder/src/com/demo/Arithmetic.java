package com.demo;

public class Arithmetic {
    public int add (int a, int b){
        return a+b;
}
    public int sub (int a, int b){
        return a-b;
    }
    public int mul (int a, int b){
        return a*b;
    }
    public int div (int a, int b){
        return a/b;
    }
    public static void main(String[] args){
    Arithmetic art=new Arithmetic();
    System.out.println("Addition of 10,15:"+art.add(10,15));
    System.out.println("Substracting of 10,15:"+art.sub(10,15));
    System.out.println("Multipication of 10,15:"+art.mul(10,15));
    System.out.println("Division of 10,15:"+art.div(10,15));
    }
}


