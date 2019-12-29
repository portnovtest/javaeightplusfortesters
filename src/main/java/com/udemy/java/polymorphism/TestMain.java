package com.udemy.java.polymorphism;

import com.udemy.java.interfacepolymorphism.Alarm;
import com.udemy.java.interfacepolymorphism.Clock;
import com.udemy.java.interfacepolymorphism.GoogleMini;
import com.udemy.java.interfacepolymorphism.IPhone;
import com.udemy.java.lambda.GreetingService;
import com.udemy.java.lambda.MathOperation;
import com.udemy.java.lambda.StringOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestMain {

   // public static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
//        AreaCalculator a = new AreaCalculator();
//        System.out.println(a.getArea(5));
//        System.out.println(a.getArea(5.25));
//        System.out.println(a.getArea(5,4));

        //abc123
        //Dog c = new Dog();
        //Cat c = new Cat();
        //Horse c = new Horse();

//        Animal a = new Dog();
//        test(a);
//        a = new Cat();
//        test(a);
//        a = new Horse();
//        test(a);

//        GoogleMini g = new GoogleMini();
//        IPhone i = new IPhone();
//        Clock c = new Clock();
//        alarmTest(g);
//        alarmTest(i);
//        alarmTest(c);
//        Dog d = new Dog();
//        Cat c = new Cat();
//        Horse h = new Horse();
//        List<Animal> l = new ArrayList();
//        l.add(d);
//        l.add(c);
//        l.add(h);
//
//        List<Alarm> a = new ArrayList<>();
//        GoogleMini g = new GoogleMini();
//        IPhone i = new IPhone();
//        Clock clock = new Clock();
//
//        a.add(g);
//        a.add(i);
//        a.add(clock);
//
//        findMaxAge(l);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(100);
//
//        //boxing
//        int number = 50;
//        Integer refInt = number;
//
//        //unboxing
//        int number2 = refInt;
//        int a = 5;
//        Dog d = new Dog();
//
//        GreetingService hiService = new GreetingService() {
//            @Override
//            public void greet(String name) {
//                System.out.println("Hi..." + name);
//            }
//        };
//
//        GreetingService helloService = (name) -> {
//            System.out.println("Hello..." + name);
//            System.out.println("Letters :: " + name.length());
//        };
//        helloService.greet("Phil");
//
//        List<String> list = new ArrayList<>();
//        list.add("");
//        list.add("jhjh");
//
//        GreetingService g1 = (n) -> {
//          return n.toUpperCase()  + list.get(1);
//        };
//
//        GreetingService g2 = (n) -> {
//            list.remove(1);
//            return n.toUpperCase();
//        };
//        System.out.println(g1.greet("Phil"));


//        GreetingService g1 = (n)-> n.toUpperCase();
//        test(g1);
//        test((n) -> n.toUpperCase() + n.toLowerCase() + n.length());
//        test(a -> a.substring(1,3));

//        test(n -> n.toUpperCase());
//        test(n -> n.toLowerCase());
//        test(n -> n.length() + "");
//        System.out.println("Starting execution");
//                        //5
//        // receiveNumber(getNumber());
//        test(s -> {
//            System.out.println("Inside lambda");
//            return s.toUpperCase();
//        });
//
//        System.out.println("Ending execution");
//        String ss = getLambda().greet("data");
//        System.out.println(ss);

        //StringOperations op1 = (s1,s2) -> s1.concat(s2);
//        StringOperations op1 = String::concat;
//        System.out.println(op1.accept("ab", "cd"));
//        StringOperations op1 = (s) -> list.add(s);
//        StringOperations op1 = list::add;
//        op1.accept("udemy");
//        System.out.println(list);
        MathOperation add = Integer::sum;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(calculate(add));
        System.out.println(calculate(subtract));
        System.out.println(calculate(multiply));
        System.out.println(calculate(divide));

    }

//    private static int getNumber(){
//        System.out.println("Called getNumber");
//        return 5;
//    }
//
//    private static void receiveNumber(int i){
//        System.out.println("Received number is :: " + i);
//    }
//    private static void test(GreetingService g){
//        g.greet("");
//        System.out.println("Inside test method. Received greeting service");
//    }
//
//    private static GreetingService getLambda(){
//      // GreetingService g = (s) -> s.toUpperCase();
//        return (s) -> s.toUpperCase();
//    }
//    private static void alarmTest(Alarm i){
//        i.setAlarm();
//    }
    //abc123
//    private static void test(Animal d){
//        d.makeSound();
//        d.walk();
//    }


//    private static void findMaxAge(List list){
//
//    }
    private static int calculate(MathOperation mathOperation){
        int a = 100;
        int b = 5;
        return mathOperation.operate(a,b);
    }
}
