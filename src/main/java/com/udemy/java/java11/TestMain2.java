package com.udemy.java.java11;

import java.util.stream.Collectors;

public class TestMain2 {
    public static void main(String[] args) {
        String str = "hi\nhello\nhow are you?";
        System.out.println(str);
        var list = str.lines()
                .collect(Collectors.toList());
        System.out.println(list);

        var str2 = "hi ";
        System.out.println(str2.repeat(5));
    }
}
