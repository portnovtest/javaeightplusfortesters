package com.udemy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class TestMain16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9);

//        int sum = 0;
//        for (Integer i : list) {
//            sum+=i;
//        }

        // Bad approach
//        Optional<Integer> reduce =  list.stream()
//                .reduce((a,b) -> {
//                    System.out.println(a + "::" + b);
//                    return a + b;
//                });
//
//        System.out.println(reduce.get());

        int sum = list.stream()
                .mapToInt(a -> a)
                .sum();
        System.out.println(sum);

        int sum1 = list.stream()
                .mapToLong(a -> a)
                .mapToInt(a -> (int) a)
                .sum();
    }
}
