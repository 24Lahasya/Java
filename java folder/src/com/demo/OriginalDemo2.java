package com.demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class OriginalDemo2 {
    public static void main(String args[]) {
        try {
            //Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("java folder/src/com/demo/Vamp"));
            Original o1 = (Original) in.readObject();
            //printing the data of the serialized object
            System.out.println(o1.id + " " + o1.name);
            //closing the stream
            in.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}