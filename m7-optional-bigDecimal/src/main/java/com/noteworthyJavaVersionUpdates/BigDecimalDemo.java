package com.noteworthyJavaVersionUpdates;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {


    public static void main(String[] args) {


        double amount1 = 374.56;
        double amount2 = 374.26;

//----------------------------------------------------------------------------------------------------------------------

        System.out.println(amount1-amount2);  // the real answer is 0.30 no remainder
//        --> 0.30000000000001137


        BigDecimal bigDecimal1 = new BigDecimal("374.56");
        BigDecimal bigDecimal2 = new BigDecimal("374.26");
        System.out.println(bigDecimal1.subtract(bigDecimal2));
//        --> 0.30

        System.out.println(bigDecimal1.add(BigDecimal.TEN));

        System.out.println("------------------------------------------------------------------");


//----------------------------------------------------------------------------------------------------------------------

//        setScale() (rounding using increment)
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING)); // CEILING -> round UP
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));   // FLOOR   -> round DOWN


        System.out.println("------------------------------------------------------------------");



    }


}
