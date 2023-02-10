package com.noteworthyJavaVersionUpdates;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {


    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(21,124,32,442,5);

//        empty()

        Optional<String> empty = Optional.empty();
       // System.out.println(empty.get());

        /* ^^ Why Optional<T> is created : instead of throwing "NullPointerException" new exception is created :
          "NoSuchElementException" by Optional<T> .get() method implementation */

//  ====================================================================================================================

        System.out.println(empty.isPresent());
//        --> false
        System.out.println(Optional.of(nums));
//        --> Optional[[21, 124, 32, 442, 5]]
        System.out.println(Optional.of(nums).isPresent());
//        --> true


        System.out.println("--------------------------------------------");


//        ifPresent() < if value is NOT equal to null action is accepted >
        Optional<Integer> bigNumber = nums.stream()
                .filter(i -> i > 1000)
                .findAny();
        bigNumber.ifPresent(System.out::println);

//        orElse() < similar to ifPresent() : if no match "other" value is thrown  >
        System.out.println(bigNumber.orElse(69));





    }



}
