package com.cydeo.practice;

import java.util.ArrayList;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {


        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};

        sunsetViews(buildings).forEach(System.out::println);

    }

    public static ArrayList<Integer> sunsetViews(int[] buildings){
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < buildings.length; i++) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()])stack.pop();

            stack.push(i);

        }
        return new ArrayList<Integer>(stack);
    }


}
