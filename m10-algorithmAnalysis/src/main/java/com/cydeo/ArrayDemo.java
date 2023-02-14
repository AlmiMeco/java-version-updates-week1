package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {


        int[] scoreArray = new int[10];
        System.out.println(scoreArray);
//        -> HashCode: [I@4dd8dc3


        scoreArray[1] = 1;

        System.out.println(Arrays.toString(scoreArray));


    }


}
