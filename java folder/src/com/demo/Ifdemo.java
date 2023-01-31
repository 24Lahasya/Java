package com.demo;

public class Ifdemo {
    public static void main(String args[]) {
        int x = 10;
        if (x<20){

        System.out.println("x is lesser ");
    }

        int y = 30;

        if (y < 20) {
            System.out.println("y is lesser");
        } else {
            System.out.println("y is greater");
        }
        int z = 30;

        if( z == 10 ) {
            System.out.println(" z is 10");
        }else if( z == 20 ) {
            System.out.println("z is 20");
        }else if( z == 30 ) {
            System.out.println("zis 30");
        }else {
            System.out.println("z value");
        }
    }
}
