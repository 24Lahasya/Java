package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String args[]){
        try{
            LinkedList<String> ll = new LinkedList<String>();
            ll.add("Lahasya");
            ll.add("Vamshi");
            ll.addLast("Deepak");
            ll.addFirst("Sujith");
            ll.add("Sai Kumar");
            System.out.println("Initial LinkedList " + ll);
            ll.add(5, "Beula");
            System.out.println("Updated LinkedList " + ll);
            List secondaList=new LinkedList();
            secondaList.addAll(ll);
            System.out.println("second aList -"+secondaList.size());
            secondaList.add("NexTurn Team");
            System.out.println("content of secondalist -"+secondaList);
            System.out.println("secondaList contains all:"+secondaList.containsAll(ll));
            for (int i = 0; i < ll.size(); i++) {
                System.out.print(ll.get(i) + " ");
            }
            System.out.println();
            System.out.println(ll.size());
            System.out.println((ll.contains("Sai Kumar")) ? "true" : "false");
            ll.remove("Sagar");
            System.out.println((ll.contains("Sagar")) ? "true" : "false");

        } catch(IndexOutOfBoundsException ie) {
            System.out.println("Index Out Of Bound" + ie.getMessage());
        }
        System.out.println("Successfull");
    }
}



