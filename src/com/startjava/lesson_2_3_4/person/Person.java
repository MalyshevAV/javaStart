package com.startjava.lesson_2_3_4.person;

public class Person {

    String sex = "male";
    String name = "Alex";
    double height = 1.8;
    double weight = 85.5;
    int age = 30;	
    
    void go() {
        System.out.println("Ходит на работу"); 
    }
    
    void sit() {
        System.out.println("Сидит за столом"); 
    }

    void run() {
        System.out.println("Бегает по утрам");
    }

    void speak() {
        System.out.println("Говорит на английском");
    }

    void learnJava() {
        System.out.println("Учит программировать на Java");
    }
}
