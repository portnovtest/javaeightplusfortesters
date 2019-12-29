package com.udemy.java;

import java.util.function.Function;

public class TestMain3 {
    public static void main(String[] args) {
        Function<String,Integer> strLen = (s) -> s.length();
        Function<Integer,Integer> plus2 = (i) -> i + 2;
        Function<Integer,Integer> square = (i) -> i*i;

        System.out.println(
                // 20          //400
                strLen.andThen(square).apply("hi hello how are you")
        );

        System.out.println(
                //10          //100
//                plus2.andThen(square).apply(8)
                //66          //64
                plus2.compose(square).apply(8)

                //andthen a.andthen(b) => a -> b
                //compose a.compose(b) => b -> a
        );
    }
}
