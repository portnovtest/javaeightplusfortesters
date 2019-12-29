package com.udemy.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class TestMain1 {
    public static void main(String[] args) {
//        Supplier<Double> random = Math::random;
//        System.out.println(random.get());

//        Consumer<String> c1 = (s) -> System.out.println(s);
//        c1.accept("udemy");

        List<String> list = new ArrayList<>();
        list.add("Phil");
        list.add("Dolganov");

        Consumer<String> dbConsumer = (s) -> {
            System.out.println("I'm writing into DB :: " + s);
        };

        Consumer<String> loggingConsumer = (s) -> {
            System.out.println("I'm writing into log file :: " + s);
        };

        Consumer<String> dbLogConsumer = dbConsumer.andThen(loggingConsumer);

//        BiConsumer<String,Integer> biConsumer = (s,i) -> {
//            System.out.println("My name :: " + s);
//            System.out.println("My age :: " + i);
//        };
//
//        //biConsumer.accept("udemy",10);
//
//
//        Map<String, Consumer<String>> map = new HashMap<>();
//
//        map.put("db", dbConsumer);
//        map.put("log", loggingConsumer);
//        map.put("dblog", dbLogConsumer);
//
//        map.forEach((k,v)->{
//            System.out.println("Key is :: " + k);
//        });
      //  list.forEach(map.get(System.getProperty("consumer-type")));
    }
}
