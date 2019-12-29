package com.udemy.java;

import java.util.ArrayList;
import java.util.List;

public class TestMain6 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        //#1
        // check for even numbers
        // interested in only 3 elements
        // find the square
        // print it on the console one by one - new line

        //#2
        // check for even numbers
        // ensure that number > 5
        // find the square and add 2 to that
        // print it on the console one by one - new line

//        for (Integer number : list) {
//            if (number % 2 == 0){
//                System.out.println(number* number);
//            }
//        }
        System.out.println("starting");
        list.stream()
                //.skip(4)
                .peek(i -> System.out.println("filter-received :: " + i))
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 5)
                //.limit(3)
                //.sorted()
                .peek(i -> System.out.println("map-received :: " + i))
                .map(i ->  i * i)
                .map(i -> i + 2)
                //.skip(2)
                .forEach(System.out::println);
        System.out.println("ending");
    }
}
