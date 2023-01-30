package com.cydeo;

import com.cydeo.warmupTask.Apple;
import com.cydeo.warmupTask.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {


        /* Anonymous Class (object being created under Functional Interface)*/
        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };


        System.out.println("********************Predicate********************");

//        boolean test(T t);

        /* accepts (Object) -> returns {boolean} */
        Predicate<Integer> lesserThan = obj -> obj < 5;

        System.out.println(lesserThan.test(20));
//        --> false

//**********************************************************************************************************************
        System.out.println("********************CONSUMER********************");

//        void accept(T t);

        /* accepts (Object) -> returns {void (whatever you want)} */
        Consumer <Integer> consumerFunction = obj -> System.out.println("Hello");

        consumerFunction.accept(1);
//         --> Hello

        System.out.println("********************BI-CONSUMER********************");

//        void accept(T t, U u);

        /* similar to consumer but accepts 2 objects */
        BiConsumer <Integer, Integer> add2Ints = (x,y) -> System.out.println(x + y);

        add2Ints.accept(13,7);
//        --> 20

//**********************************************************************************************************************
        System.out.println("********************FUNCTION********************");

//        R apply(T t);

        /* accepts (Object T) -> returns {Object U} */
        Function<String, String> fun = str -> "Hello " + str;

        System.out.println(fun.apply("Almi"));
//        --> Hello Almi

        System.out.println("********************BI-FUNCTION********************");

        BiFunction<Integer, Integer, String> timeTracker = (start, finish) -> "You have been working for " + (finish-start) + "Hrs";
        System.out.println(timeTracker.apply(7,9));


//**********************************************************************************************************************
        System.out.println("********************SUPPLIER********************");

//      T get();

        /* accepts (void) -> returns {Object T}*/

        Supplier <Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());





















    }

}
