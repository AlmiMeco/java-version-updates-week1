package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperatrions {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //list.forEach(System.out::println);

        System.out.println("[   Filter Operation ( .filter() method )   ]");

        list.stream()
//    [INTERMEDIATE OPERATION]
                .filter(i -> i % 2 == 0)       // filtering collection (list) based on lambdaParam. (only evens get passed)
//    [TERMINAL OPERATIONS]
                .forEach(System.out::println); // print loop for each element (that passed filter) from collection (list)

        System.out.println("[   Limit Operation ( .limit() method )   ]");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(3)             // limits how many elements will be passed (filtered) {after first 3 -> no more}
                .forEach(System.out::println);


        System.out.println("[   Skip Operation ( .skip() method )   ]");

        list.stream()

                .filter(i -> i % 2 == 0)
                .skip(3)                 // skips (n) number of elements from stream {elements 1-3 are skipped}
                .forEach(System.out::println);


        System.out.println("[   Map Operation ( .map() method )   ]");

        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i*2)             // maps an action(s) to the element/object {filtered int (i) is mult. x2}
                .forEach(System.out::println);

    }

}
