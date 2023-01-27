package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapElementsGeneric {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Integer[] a = {1,2,3,4};
        swap(a,0,1);
        System.out.println(Arrays.asList(a));

        String[] str = {"Almi", "Koko", "Arjan", "Jackson"};
        swap(str, 0, 2);
        System.out.println(Arrays.toString(str));

    }

    private static <T> void swap(T[] array, int index1, int index2){

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
