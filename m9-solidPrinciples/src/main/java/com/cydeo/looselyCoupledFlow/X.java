package com.cydeo.looselyCoupledFlow;

public class X {

    public static void main(String[] args) {

        Z z = new A();

        z.method();


//        {method} is being called thru "A" class implementation of {method} belonging to "Z" interface

//        flow of control & source code dependancy are following different paths ... this == "Loosely Coupled Flow"


    }


}
