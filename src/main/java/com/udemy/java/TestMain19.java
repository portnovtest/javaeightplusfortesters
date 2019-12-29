package com.udemy.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestMain19 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/first-names.txt");
        List<String> list = Files.readAllLines(path);

        // print the count of names which start w/ B
        // create a list of names which start w/ C and contain 's' in it
        // print the total number of chars for all the names starting w/ M

        // Mary, Mike => 8
    }
}
