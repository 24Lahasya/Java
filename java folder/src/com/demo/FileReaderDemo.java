package com.demo;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo{
        public static void main(String args[]) {
            try {
                FileReader fr = new FileReader("E:/Java/java folder/src/com/demo/Samp.txt");
                System.out.println("reading");
                int i;
                while ((i = fr.read())!= -1) {
                    System.out.println((char) i);
                }
                fr.close();
            } catch (FileNotFoundException fe) {
                System.out.println("fileNotFoundException:" +fe.getMessage());
                fe.getMessage();
            } catch (IOException ie) {
                System.out.println("fileNotFoundException:" +ie.getMessage());
                ie.getMessage();
            }
        }
    }