package com.java.variablescopes;

public class GlobalVariable {
//    Global Variables
    int numberOne;
    int numberTwo;
    int sum;
    GlobalVariable(){
        addition();
    }

    //    Method with arguments
    void addition() {
        sum = 1 + 2;
        System.out.println("Global variable sum is: " + sum);
    }
}
