package com.udemy.java.java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(null);

//        Collections.addAll(list, 1,2,3,4,5,null);
//        List<Integer> list = Arrays.asList(1,2,3,4,5,null);
//        System.out.println(
//                list
//        );

        // JAVA 9
        List<Integer> list = List.of(1,2,3,4);

        System.out.println(list);

    }
}
