package com.java.overloadedconstructors;

public class OverloadedConstructor {
    public static void main(String[] args){
        Person person = new Person("Jonathan", 18 , 50.2, "Quezon City", "Software Engineer");

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.weight);
        System.out.println(person.location);
        System.out.println(person.occupation);
    }
}
