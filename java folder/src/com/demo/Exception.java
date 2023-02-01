package com.demo;

public class Exception extends Throwable {

        public static void main(String[] args) {
            int[] num = {0,1,2,3,4,5,6};
            try{
                System.out.println(num[2]);
                System.out.println(num[7]);
                System.out.println(10/0);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array length is 7");
            } catch (ArithmeticException e){
                System.out.println("we cannot divide a number with zero");
            }
            System.out.println("execution completed");
        }
    }
