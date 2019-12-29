package com.udemy.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMain13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Airplane");
        list.add("Ball");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Delta");

        Stream<String> stream = list.stream()
                .filter(s -> s.length() > 3);
        stream.forEach(System.out::println);
        stream.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
