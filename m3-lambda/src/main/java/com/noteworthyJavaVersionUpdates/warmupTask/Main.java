package com.noteworthyJavaVersionUpdates.warmupTask;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Apple> appleInventory = new ArrayList<>();
        appleInventory.add(new Apple(Color.GREEN, 230));
        appleInventory.add(new Apple(Color.RED, 151));
        appleInventory.add(new Apple(Color.GREEN, 212));
        appleInventory.add(new Apple(Color.RED, 122));
        appleInventory.add(new Apple(Color.RED, 105));
        appleInventory.add(new Apple(Color.RED, 317));


        System.out.println(appleInventory.get(0).getColor());
        System.out.println("------------------------------------------------");

        // List<Apple> heavyApples = filterApples(appleInventory, new HeavyApplePredicate());
        //List<Apple> greenApples = filterApples(appleInventory, new GreenApplePredicate());


        //System.out.println("greenApples = " + greenApples);
        //  System.out.println("heavyApples = " + heavyApples);

        System.out.println("------------------------------------------------");


        /* Instead of having to create Green/HeavyApplePredicate Classes just for one implementation of the method you can
        create the method and store it under the signature (appleWeight/Color) using Lambda Expressions */

        ApplePredicate appleWeight = (Apple apple) -> apple.getWeight() >= 200;
        ApplePredicate appleColor = (Apple apple2) -> apple2.getColor().equals(Color.GREEN);

        filterApples(appleInventory, appleWeight);


    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredcate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredcate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
