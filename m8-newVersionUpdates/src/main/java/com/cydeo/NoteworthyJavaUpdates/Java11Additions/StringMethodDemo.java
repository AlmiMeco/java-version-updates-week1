package com.cydeo.NoteworthyJavaUpdates.Java11Additions;

public class StringMethodDemo {

    public static void main(String[] args) {


        var str = "Mike \nOzzy \nAlmi \nPiro";


        str.lines().forEach(System.out::println);


    }


}
