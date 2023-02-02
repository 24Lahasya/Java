package com.demo;
import java.io.*;
public class OriginalDemo {
    public static void main(String[] args) {
        try{
            //Creating the object
            Original o1 =new Original(1,"Klaus Mikealson");;
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("java folder/src/com/demo/Vamp");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(o1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("The Originals");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}