package com.cydeo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        List<Integer> sll = new LinkedList<>();

        for (int i = 0; i < 9; i++) {
            sll.add(i);
        }

        System.out.println(sll);

        printMiddleOfList(sll);


    }

    public static void printMiddleOfList(List<Integer> sll){

        int middle = -1;

        for (int  j = 0 ; j < sll.size(); middle++ , j+=2) {
//                System.out.println("i -> " + i + "\n j -> " + j);
        }

        System.out.println(sll.get(middle));

    }


}
