package com.demo;


import java.util.Scanner;

public class Stats2 extends Stats{
    public static void main(String[] args) {
        Stats2 s1 = new Stats2();
        System.out.println("Enter 4 values in ascending order:");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        int m = a.nextInt();
        int n = a.nextInt();
        int o = a.nextInt();
        int p = a.nextInt();
        System.out.println("m: "+m+" n: "+n+" o: "+o+" p: "+p);
        System.out.println("mean of above nums: "+s1.mean(m,n,o,p));
        System.out.println("median of above nums: "+s1.median(m,n,o,p));
        System.out.println("mode of above nums: "+s1.mode(m,n,o,p));
    }
}