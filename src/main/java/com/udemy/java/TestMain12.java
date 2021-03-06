package com.udemy.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain12 {
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

        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        Map<Character, List<String>> group = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(group);
    }
}
