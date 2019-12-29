package com.udemy.java.assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNameAssignment {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/first-names.txt");
        List<String> list = Files.readAllLines(path);

            // print the count of names which start w/ B
            // create a list of names which start w/ C and contain 's' in it
            // print the total number of chars for all the names starting w/ M

            // Mary, Mike => 8

        // print the count of names which start w/ B
        System.out.println(
                list.stream()
                        .filter(s -> s.startsWith("B"))
                        .count()
        );

        // create a list of names which start w/ C and contain 's' in it
        List<String> names = list.stream()
                .filter(name -> name.startsWith("C"))
                .filter(name -> name.toLowerCase().contains("s"))
                .collect(Collectors.toList());
        System.out.println(names.size());

//        List<Integer> charCount = new ArrayList<>();
//
//        list.stream()
//                .map(String::toLowerCase)
//                .filter(s -> s.startsWith("m"))
//                .forEach(s -> charCount.add(s.length()));
//
//        int sum = charCount.stream()
//                .mapToInt(s -> s)
//                .sum();
//        System.out.println(sum);

        // print the total number of chars for all the names starting w/ M
        System.out.println(
                list.stream()
                .filter(name -> name.startsWith("M"))
                        .map(String::trim)
                .map(String::length)
                .mapToInt(i -> i)
                .sum()
        );

        //Solution: find the names containing - in it replace it w/ a space;
        System.out.println(
                list.stream()
                .filter(name -> name.contains("-"))
                .map(name -> name.replaceAll("-"," "))
                .collect(Collectors.toList())
        );

        // Solution: find the name which has max number of characters
        System.out.println(
                list.stream()
                .max(Comparator.comparing(String::length))
                .get()
        );


    }
}
