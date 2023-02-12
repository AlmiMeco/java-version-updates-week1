package com.cydeo.NoteworthyJavaUpdates.Java10Additions;

import java.util.Arrays;

public class LocalVariablaDemo {
    /** VAR ADDED TO TAKE PLACE OF DATA-TYPES IDENTIFIER (DATA-TYPE IS INFERRED) *only for local variables* **/
    public static void main(String[] args) {

//        Java 9 way of creating local var.
        String s = "Cydeo";
        int num1 = 6;


//        Java 10 way of creating local var. (can't be called by class obj)
        var str = "Cydeo";
        var num2 = 9;

//======================================================================================================================

//        var takes place of List signature
        var numbers =Arrays.asList(1,2,3,4);


    }


}
