package com.udemy.calculator;

import com.udemy.java.lambda.MathOperation;

public class TestMain {
    public static void main(String[] args) {
        String exp1 = "5 + 2 - 3 * 7 + 2 / 3";
        String exp2 = "10 / 2 * 3 - 3 / 3 * 5";
        String exp3 = "9 * 9 - 1 * 7 / 8 + 30";

        System.out.println(Calculator.calculate(exp1));
        System.out.println(Calculator.calculate(exp2));
        System.out.println(Calculator.calculate(exp3));

        String exp4 = "9 * 9 - 1 * 7 / 8 + 30 ^ 2 % 3";
        Calculator.addOperation("^", ((a, b) -> (int)Math.pow(a,b)));
        Calculator.addOperation("%", ((a, b) -> a % b));
        System.out.println(Calculator.calculate(exp4));
    }

//    private static int calculate(MathOperation mathOperation){
//        int a = 100;
//        int b = 5;
//        return mathOperation.operate(a,b);
//    }


}
