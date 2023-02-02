package com.java.oop;

public class Food {
    String foodName = "squash";
    String classification = "vegetable";
    double price = 80.00;

//    Defining method
    void buy() {
        System.out.println("Thanks for buying vegetables.");
    }

    void reject() {
        System.out.println("This is a reject vegetable, Don't buy it.");
    }
}
