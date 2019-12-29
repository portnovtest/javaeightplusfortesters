package com.udemy.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestMain8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");

        System.out.println(
                list.stream()
                        .filter(s -> s.length() > 3)
                        .count()
        );

        Optional<String> op = list.stream()
                .filter(s -> s.length() > 3)
                .findFirst();

        op.ifPresent(System.out::println);

        System.out.println(
                list.stream()
                        .filter(s -> s.length() > 3)
                        .findFirst()
        );
    }
}
