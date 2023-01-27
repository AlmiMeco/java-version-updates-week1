package com.cydeo;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {


        /* .values */

        Currency[] currency = Currency.values();
        System.out.println(Arrays.asList(currency));
//        [PENNY, NICKLE, DIME, QUARTER]


        for (Currency c : currency) {
            System.out.println(c);
        }

        /* .ordinal */

        System.out.println(Currency.PENNY.ordinal()); // <-- returns index value of
        // 0


        System.out.println();


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------














    }
}



