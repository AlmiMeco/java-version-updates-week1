package com.cydeo.tasks;

import java.util.Arrays;

public class SwapElementsNonGeneric {

    /* Write a generic method to exchange the positions of two different elements in array. */


    public static void main(String[] args) {

//                      0  1  2  3  4  <-- index #s
        int[] array1 = {1, 2, 3, 4, 5};
        swap(array1, 0, 2);
        System.out.println(Arrays.toString(array1));
//       ---> [3, 2, 1, 4, 5]


    }

//   |NON_GENERIC METHOD (int type)|
    private static void swap(int [] arr1, int index1, int index2){

        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
    }




}
