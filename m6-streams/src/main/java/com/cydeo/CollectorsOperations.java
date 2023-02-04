package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsOperations {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,3,4,763,2,6,7);


//        .toCollection(Supplier)
       List<Integer> numberList = numbers.stream()
                .filter(i -> i%2==0)                                // filters out ODD numbers
                .collect(Collectors.toCollection(ArrayList::new)); // collects filtered elements and places in new Collection

        System.out.println(numberList);

        System.out.println("===========================================================");

//        .toList()
        List<Integer> numberList2 = numbers.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toList());                    // same as toCollection but less code

        System.out.println(numberList2);





    }


}
