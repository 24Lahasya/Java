package com.demo;

import java.io.IOException;
import java.io.StringWriter;

public class Demo2 {
    public static void main(String[] args) {

        String data = "This is the StringWriter";

        try {

            StringWriter output = new StringWriter();


            output.write(data);


            System.out.println("Data in the StringWriter: " + output);

            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}