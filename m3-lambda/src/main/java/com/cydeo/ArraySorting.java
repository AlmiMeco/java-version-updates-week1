package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {


        ArraySorting as = new ArraySorting();
        as.sort();

        QuickSort qs = new QuickSort();
        qs.sort();

        BubbleSort bs = new BubbleSort();
        bs.sort();



        /* LAMBDA EXPRESSION */

        Sorting quickSort = () -> System.out.println("Quick Sorting");


    }


    private void sort(){
        System.out.println("Sorting Array");
    }

}
