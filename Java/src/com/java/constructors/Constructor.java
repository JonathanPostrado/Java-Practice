package com.java.constructors;

public class Constructor {
    public static void main(String[] args){
        People human = new People("Jonathan", 18, "Vegetables");
        System.out.println(human.name);

        //    This line calls the method bio from People.java
        human.bio();
    }
}
