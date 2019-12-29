package com.udemy.java;

import com.udemy.java.compare.Student;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestMain15 {
    public static void main(String[] args) {
        Student a = new Student("Adam", 80, 150);
        Student b = new Student("Bob", 96, 123);
        Student c = new Student("Carl", 75, 135);

        Optional<Student> op = Stream.of(a, b, c)
                .max(Comparator.comparing(Student::getHeight));

        System.out.println(op.get());
    }
}
