package com.demo;
import java.io.Serializable;

public class Original implements Serializable{
    int id;
    String name;
    public Original(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


