package com.udemy.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMain9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");

        System.out.println(
                list.stream()
                        .filter(s -> s.length() > 3)
                        .max(Comparator.naturalOrder())
                .get()
        );

        System.out.println(
                list.stream()
                        .filter(s -> s.length() > 3)
                        .noneMatch(s -> s.contains("z"))
        );
    }
}