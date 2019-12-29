package com.udemy.java.polymorphism;

public abstract class Animal {

    private String name;
    //public abstract void eat();
    public void makeSound(){
        System.out.println("I am animal.. Grrr... ");
    }

    public void walk(){
        System.out.println("I am walking");
    }
}
