package com.cydeo.lambdaTasks;

import com.cydeo.warmupTask.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {


    public static void main(String[] args) {


        List<Orange> orangeList =  new ArrayList<>();
        orangeList.add(new Orange(244, Color.GREEN));
        orangeList.add(new Orange(442, Color.RED));
        orangeList.add(new Orange(215, Color.GREEN));
        orangeList.add(new Orange(532, Color.RED));
        orangeList.add(new Orange(353, Color.RED));


        /* LAMBDA EXPRESSIONS (placed under object / variable name ) */

        OrangeFormatter xxx = orange -> "An orange of " + orange.getWeight() + "g ";

                prettyPrintOrange(orangeList, xxx);

        System.out.println("_________________________________________________________________________________________");

        /* LAMBDA EXPRESSION (created directly as a parameter)*/

                prettyPrintOrange(orangeList, orange -> "A Dark " + orange.getColor() + " colored Orange");

        System.out.println("_________________________________________________________________________________________");

        /* LAMBDA EXPRESSIONS (with more than one argument ... {switch, if stmtnts, ternary etc..})*/

OrangeFormatter argumentativeFormatter = orange -> {
    String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
    return "A " + ch + " " + orange.getColor() + " orange";
};
                prettyPrintOrange(orangeList,argumentativeFormatter);


//        OrangeFormatter argumentativeFormatter2 = orange -> {
//            String ch = "";
//            if (orange.getWeight() < 300) {
//                ch = "Light";                                             using If(statements)
//            } ch = "Heavy";
//            return "A " + ch + " " + orange.getColor() + " orange";
//        };

    }


    private static void prettyPrintOrange(List<Orange> orangeList, OrangeFormatter formatter){
        for (Orange orange : orangeList){
            String output = formatter.test(orange);
            System.out.println(output);
        }
    }

}
