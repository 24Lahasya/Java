package com.demo;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedDemo {
    public static void main(String[] args) {
        try {

            final PipedReader reads = new PipedReader();
            final PipedWriter writes = new PipedWriter(reads);

            Thread readerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        int data = reads.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = reads.read();
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            });

            Thread writerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        writes.write("This is the program for Piped Reader and Piped Writer\n".toCharArray());
                    } catch (IOException ex) {
                    }
                }
            });

            readerThread.start();
            writerThread.start();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
