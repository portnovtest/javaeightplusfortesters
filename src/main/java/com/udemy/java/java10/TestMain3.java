package com.udemy.java.java10;

import java.util.List;
import java.util.stream.Collectors;

public class TestMain3 {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        var newList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

    }
}
