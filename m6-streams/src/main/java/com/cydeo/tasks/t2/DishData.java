package com.cydeo.tasks.t2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**Print all dish’s name that has less than 400 calories || Print the length of the name of each dish
 **/

public class DishData {


    public static void main(String[] args) {




        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );


        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(dish -> dish.getName())
                .forEach(System.out::println);


        System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");


        menu.stream()
                .map(dish -> dish.getName() + " -> " + dish.getName().length() )
                .forEach(System.out::println);


        System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");

//        |Filtering Dish By <400 cals : ordering them by cal (greatest -> least)|
        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)

                .forEach(System.out::println);


//        |Ordering Dishes by Calorie : least -> greatest|
        menu.stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .forEach(System.out::println);

    }



}
