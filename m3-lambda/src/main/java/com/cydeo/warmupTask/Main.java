package com.cydeo.warmupTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List <Apple> appleInventory = new ArrayList<>();
        appleInventory.add(new Apple(Color.GREEN, 230));
        appleInventory.add(new Apple(Color.RED, 151));
        appleInventory.add(new Apple(Color.GREEN, 212));
        appleInventory.add(new Apple(Color.RED, 122));
        appleInventory.add(new Apple(Color.RED, 105));
        appleInventory.add(new Apple(Color.RED, 317));


        System.out.println(appleInventory.get(0).getColor());
        System.out.println("------------------------------------------------");

        List<Apple> heavyApples = filterApples(appleInventory, new HeavyApplePredicate());
        List<Apple> greenApples = filterApples(appleInventory, new GreenApplePredicate());


        System.out.println("greenApples = " + greenApples);
        System.out.println("heavyApples = " + heavyApples);



    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredcate applePredcate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredcate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
