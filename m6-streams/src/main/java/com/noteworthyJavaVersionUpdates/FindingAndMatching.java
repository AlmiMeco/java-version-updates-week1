package com.noteworthyJavaVersionUpdates;

import com.noteworthyJavaVersionUpdates.tasks.t2.Dish;
import com.noteworthyJavaVersionUpdates.tasks.t2.Type;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingAndMatching {

    public static void main(String[] args) {


        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800, Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );



//        |.allMatch method|
//      all parameters must return true for the final return == true

        boolean isAllFoodLessThan1000Cals =
                menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
//        --> returns boolean

        System.out.println(isAllFoodLessThan1000Cals);

        System.out.println("------------------------------------------------");

//        |.anyMatch method|
//      at least ONE element must match the parameter to return -> true

        if (menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The Menu is Vegetarian Friendly");
        }

        System.out.println("------------------------------------------------");


//        |.noneMatch method|
//      none of the elements can match the parameter to return -> true

        boolean isHealthy =
                menu.stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy);


        System.out.println("------------------------------------------------");


//        |.findAny method|

        Optional<Dish> dish1 =
                menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();

        System.out.println(dish1.get());

        System.out.println("------------------------------------------------");

//        Parallel Streams (ASYNC)
//        [.findAny VS. .findFirst]

        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        System.out.println("------------------------------------------------");

//        |.min & .max method|
//      accepts Comparator<T> Interface returns -> Optional<T> Interface
        Optional<Dish> findMinCals =
                menu.stream()
                .min(Comparator.comparing(Dish::getCalories));

        System.out.println(findMinCals);

//  -------------------------------------------------------------------------------

        Optional<Dish> findMaxCals =
                menu.stream()
                        .max(Comparator.comparing(Dish::getCalories));

        System.out.println(findMaxCals.get());

        System.out.println("------------------------------------------------");


        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int result =
                numbers.stream()
                .reduce(0, (a,b) -> a+b);

        System.out.println(result);



        System.out.println("---------------------------------------------------------");



        int totalCals =
                menu.stream()
                        .map(Dish::getCalories)
            //          .reduce((a,b) -> a+b)
                        .reduce(Integer::sum)
                        .get(); // not a Terminal Operator ... just there to retrieve elements of Optional<Integer>

        System.out.println("TOTAL CALORIES FOR ALL DISHES : " + totalCals);



        System.out.println("---------------------------------------------------------");

























    }


}
