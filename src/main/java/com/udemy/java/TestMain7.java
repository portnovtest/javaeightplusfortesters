package com.udemy.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestMain7 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);

        List<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);

        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        list.stream()
                .flatMap(Collection::stream)
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
