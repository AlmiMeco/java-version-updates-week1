package com.cydeo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class CarTest {


    public static void main(String[] args) {

//        Zero Arg Const

        Supplier<Car> c1 = () -> new Car();

        Supplier<Car> c2 = Car :: new;



//        All Arg Const

        BiConsumer<Integer, Car> c3 = (integer, car) -> System.out.println("Car #" + integer);
        c3.accept(43, new Car("Audi", 2017));

        BiFunction<String, Integer, Car> c4 = Car :: new;




    }



}
