package com.udemy.java.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestMain4 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/java11-demo.txt");
        //Files.writeString(path,"Java is cool");

        System.out.println(Files.readString(path));
    }
}
