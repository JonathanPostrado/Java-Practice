package com.java.constructors;

public class People {
//    Defining the people attributes
    String name;
    int age;
    String favoriteFood;

//    Defining parameters in People Class
    People(String name, int age, String favoriteFood){
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

//    Defining a method
    void bio(){
        System.out.println(this.name + " " + "is working 8 hours a day");
    }
}
