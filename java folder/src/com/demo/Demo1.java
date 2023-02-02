package com.demo;

import java.io.IOException;
import java.io.StringReader;

public class Demo1 {
    public static void main(String[] args) {

        String data = "This is a String Reader .";

        // Create a character array
        char[] c = new char[data.length()];

        try {
            // Create a StringReader
            StringReader input = new StringReader(data);

            //Use the read method
            input.read(c);
            System.out.println("Data read from the string:");
            System.out.println(c);

            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


      

