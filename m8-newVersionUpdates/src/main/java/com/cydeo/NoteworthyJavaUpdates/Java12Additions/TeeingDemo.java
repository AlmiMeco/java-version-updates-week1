package com.cydeo.NoteworthyJavaUpdates.Java12Additions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingDemo {


    public static void main(String[] args) {


        List<Employee> employeeList = Arrays.asList(
                new Employee(01,"Almi", 100000),
                new Employee(02,"Jack", 72000),
                new Employee(03,"Mike", 125000),
                new Employee(04,"Koko", 100000)
        );

//        HashMap<String,Employee> result = employeeList.stream().collect(Collectors.teeing(
//                   Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
//                   Collectors.minBy(Comparator.comparing(Employee::getSalary)),
//                        (e1,e2) -> {
//                            HashMap<String,Employee> map = new HashMap<>();
//                            map.put("MAX:", e1.get());
//                            map.put("MIN:", e2.get());
//                            return map;
//
//                        }
//                ));


        var result = employeeList.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                (e1,e2) -> {
                    HashMap<String,Employee> map = new HashMap<>();
                    map.put("MAX:", e1.get());
                    map.put("MIN:", e2.get());
                    return map;

                }
        ));

        System.out.println(result);

    }





}
