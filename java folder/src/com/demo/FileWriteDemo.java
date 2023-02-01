package com.demo;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("E:/Java/java folder/src/com/demo/Samp.txt");
            myWriter.write("Files in Java is ");
            myWriter.close();
            System.out.println("Successfully.");
        } catch (IOException e) {
            System.out.println("error occurred.");
            e.printStackTrace();
        }
    }
}


