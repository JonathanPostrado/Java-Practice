package com.java.oop;

public class Oop {
    public static void main(String[] args){
        Food myFood = new Food();

//      Displaying Attributes
        System.out.println(myFood.foodName);
        System.out.println(myFood.classification);
        System.out.println(myFood.price);

//      Displaying methods
        myFood.buy();
        myFood.reject();
    }
}
