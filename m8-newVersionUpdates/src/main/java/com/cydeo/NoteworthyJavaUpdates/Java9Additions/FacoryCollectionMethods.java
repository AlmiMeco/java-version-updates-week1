package com.cydeo.NoteworthyJavaUpdates.Java9Additions;

import java.util.*;

public class FacoryCollectionMethods {

    public static void main(String[] args) {

//        Creating Immutable Collections before Java 9
        List<String> list = Collections.unmodifiableList(Arrays.asList("JAVA", "PYTHON", "AGILE"));
        //list.add("C#"); <-- creates exception ^^^ unmodifiable (immutable)


        System.out.println(list);


//        Creating Immutable Collections after Java 9  {.of method}
        List<String> list2 = List.of("Java", "PYTHON", "AGILE");


        System.out.println(list2);


//        Creating Immutable Maps after Java 9
        Map<String, Integer> cart = Map.ofEntries(
                Map.entry("Samsung TV", 2),
                Map.entry("Frozen Pizzas", 3),
                Map.entry("Lamborghini Urus", 1)
        );

        System.out.println("------------------------------------------");
        System.out.println(cart);







    }

}
