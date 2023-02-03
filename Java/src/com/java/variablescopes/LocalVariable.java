package com.java.variablescopes;

public class LocalVariable {
    LocalVariable(){
//        Local Variable
        int numberOne = 10;
        int numberTwo = 20;
        int sum = 0;

//      Passing variables on method
        addition(numberOne, numberTwo, sum);
    }

//    Method with arguments
    void addition(int numberOne, int numberTwo, int sum) {
        sum = numberOne + numberTwo;
        System.out.println("Local variable sum is: " + sum);
    }


}
