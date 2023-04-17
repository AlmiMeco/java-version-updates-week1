package com.cydeo;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionsStack {

    public static void main(String[] args) {


        Deque<Integer> cStack = new LinkedList<>();
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);

        System.out.println(cStack);

        System.out.println(cStack.pop()); // -> 3
        System.out.println(cStack.pop()); // -> 2
        System.out.println(cStack.pop()); // -> 1
        /* FILO -> [First-In : Last-Out] */

        System.out.println(cStack);


    }

}
