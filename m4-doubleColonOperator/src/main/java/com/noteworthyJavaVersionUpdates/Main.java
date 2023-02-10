package com.noteworthyJavaVersionUpdates;

import java.util.function.BiFunction;

public class Main {


    public static void main(String[] args) {

//        Predicate <Integer> pred = (p) -> p % 2 == 0 ? true : false;

//        Calling Lambda from Interface (description of the method)
        Calculate multiplyNumWInterface = (x,y) -> System.out.println(x*y);

//        Calling Lambda from (static) class 'Calculator' *must have matching implementation & return as functionalInterf.*
//        (method name)
        Calculate multiplyNumWMethodName = (x, y) -> Calculator.findMultiplication(x,y);

//                                                  (Method Reference)
        Calculate multiplyNumWMethodRefrence = Calculator::findMultiplication;

        multiplyNumWMethodRefrence.calculate(10,2);
//        --> 20

//  --------------------------------------------------------------------------------------------------------------------
//  --------------------------------------------------------------------------------------------------------------------
//  --------------------------------------------------------------------------------------------------------------------

        Calculator calculator1 = new Calculator();

        Calculate instanceMethodRefrence = calculator1::findAddition;
        instanceMethodRefrence.calculate(12,2);


        BiFunction<String, Integer, String> str = String::substring;
        System.out.println(str.apply("BRASS", 2));
















    }
}