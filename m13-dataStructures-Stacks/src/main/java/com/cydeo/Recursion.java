package com.cydeo;

public class Recursion {
/** Calling A Method(funct) inside the same Method(funct) -> RECURSION  **/
    public static void main(String[] args) {



    }


    public static int fib(int n){

        if (n==0) return 0;
        if (n==1) return 1;
        return fib(n-1) + fib(n-2);

    }



}
