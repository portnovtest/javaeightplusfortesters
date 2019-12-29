package com.udemy.java.java11;

public class TestMain3 {
    public static void main(String[] args) {
        char c = '\u2002';
        String str = c + "  udemy  " + c;
        System.out.println("::" + str.trim() + "::");
        System.out.println("::" + str.strip() + "::");
        System.out.println("::" + str.stripLeading() + "::");
        System.out.println("::" + str.stripTrailing() + "::");
    }
}
