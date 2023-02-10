package com.noteworthyJavaVersionUpdates.tasks.flatMapTask;

public class EmployeeTest {

    public static void main(String[] args) {


//        Print All Emails
        EmployeeData.readAll()
                .map(Employee -> Employee.getEmpEmail())
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------");

//        Print All Employee Phone #s
        EmployeeData.readAll()
                .map(Employee -> Employee.getEmpPhoneNumbers())
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------");


        EmployeeData.readAll()
                .flatMap(Employee -> Employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

    }


}
