package com.demo;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Bufferoutputstreams{
    public static void main(String args[]) throws IOException {

        FileOutputStream file =new FileOutputStream ("E:/Java/java folder/src/com/demo/Samp.txt");
        BufferedOutputStream bout=new BufferedOutputStream(file);
        String s="Java is good.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        file.close();
        System.out.println("success");
    }
}
