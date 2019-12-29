package com.udemy.java.java9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args) {
      Stream<Integer> numbers = Stream.of(4,2,1,4,5,2,1,1,2,1,3,5,2,1);

//        System.out.println(
//                numbers
//                .takeWhile(i -> i < 5)
//                .collect(Collectors.toList())
//        );

        System.out.println(
                numbers
                        .dropWhile(i -> i < 5)
                        .collect(Collectors.toList())
        );
    }
}
