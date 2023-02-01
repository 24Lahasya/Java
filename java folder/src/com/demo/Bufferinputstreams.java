package com.demo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Bufferinputstreams{
    public static void main(String[] args) {
        try {


            FileInputStream file = new FileInputStream ("E:/Java/java folder/src/com/demo/Samp.txt");


            BufferedInputStream input = new BufferedInputStream(file);


            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);


                i = input.read();
            }
            input.close();
        }

        catch ( IOException e) {
            e.getStackTrace();
        }
    }
}