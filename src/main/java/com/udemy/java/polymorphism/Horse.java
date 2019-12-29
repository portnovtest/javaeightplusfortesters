package com.udemy.java.polymorphism;

public class Horse extends Animal{

//    public void makeSound(){
//        System.out.println("I am horse. neighing...");
//    }

    @Override
    public void walk(){
        System.out.println("I am galloping...");
    }
}
