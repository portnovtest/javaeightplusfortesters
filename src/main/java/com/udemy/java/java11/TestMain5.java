package com.udemy.java.java11;

import java.util.List;
import java.util.Optional;

public class TestMain5 {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4);
        var op = list.stream()
                .filter(i -> i > 5)
                .findFirst();

        if (op.isEmpty()){
            System.out.println("No such number");
        }
        System.out.println(op.isPresent());
    }
}
