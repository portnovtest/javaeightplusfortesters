package com.udemy.java;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

public class TestMain4 {
    public static void main(String[] args) {
        // Runnable

        Runnable r = () -> {
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Hello world");
        };

        new Thread(r).start();
        System.out.println("Hi");
        //r.run();
    }
}
