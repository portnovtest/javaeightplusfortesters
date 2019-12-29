package com.udemy.java;

import com.udemy.java.util.LinkUtil;

public class TestMain10 {
    public static void main(String[] args) {
        System.out.println(
                LinkUtil.getResponseCode("https://www.google.com")
        );
    }
}
