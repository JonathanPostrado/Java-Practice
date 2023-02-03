package com.java.overloadedconstructors;

public class Person {
//    Defining Arguments
    String name;
    int age;
    double weight;
    String location;
    String occupation;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, double weight, String location, String occupation) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.location = location;
        this.occupation = occupation;
    }
}
