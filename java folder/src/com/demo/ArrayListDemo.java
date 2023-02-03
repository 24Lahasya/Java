package com.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            List aList = new ArrayList<String>();
            aList.add("Lahasya");
            aList.add("Sai Kumar");
            aList.add("Vamshi");
            aList.add("Sagar");
            aList.add("Deepak");
            aList.add("Sujith");
            List secondaList=new ArrayList();
            secondaList.addAll(aList);
            System.out.println("second aList -"+secondaList.size());
            secondaList.add("newItem");
            System.out.println("content of secondalist -"+secondaList);
            System.out.println("secondaList contains all:"+secondaList.containsAll(aList));
            System.out.println(aList);
            System.out.println(aList.size());
            System.out.println((aList.contains("Sai Kumar")) ? "true" : "false");
            aList.remove("Sagar");
            System.out.println(aList.size());
            System.out.println((aList.contains("Sagar")) ? "true" : "false");
            System.out.println(aList.get(0));
            System.out.println(aList.get(6));
        } catch(IndexOutOfBoundsException ie) {
            System.out.println("Index Out Of Bound" + ie.getMessage());
        }
            System.out.println("Successfull");
    }
}
