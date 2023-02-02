package com.demo;

public class Stats extends Statistics {
    public float mode(int a,int b,int c, int d){
        return ((3*median(a,b,c,d))-(2*mean(a,b,c,d)));
    }
}

