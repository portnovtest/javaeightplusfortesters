package com.udemy.java.java9;

import java.util.Set;
import java.util.stream.Collectors;

public class TestMain3 {
    public static void main(String[] args) {
        Set<String> set = Set.of("ab","bc","cd");
        System.out.println(set);

        System.out.println(
                set.stream()
                .filter(s -> s.contains("b"))
                .collect(Collectors.toSet())
        );
    }
}
