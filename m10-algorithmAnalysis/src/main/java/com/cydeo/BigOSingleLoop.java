package com.cydeo;

public class BigOSingleLoop {


    public static void main(String[] args) {

        long numberOfOperations = 0;
        int n = 1000000;
        long startTime;
        long endTime;

//======================================================================================================================

        System.out.println("Input Size 'n' is = " + n);

//        Singlge Loop  [  O(n)  ]

        startTime=System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println("Number Of Operations w/ Single: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        Nested Loop  [  O(n^2)  ]
        numberOfOperations=0;
        startTime=System.currentTimeMillis();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperations+=1;
            }
        }

        endTime=System.currentTimeMillis();

        System.out.println("Number Of Operations w/ Nested Loop: " + numberOfOperations + " in " + (endTime-startTime) + " miliseconds");

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        Logarithmic Complexity  [  O(log n)  ]
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");




    }


}
