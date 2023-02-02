package com.cydeo.tasks.floatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {



    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Almi", "almi2001@hotmail.com", Arrays.asList("615-830-7902", "615-838-1917")),
                new Employee(101, "Ozzy", "ozyMan@hotmail.com", Arrays.asList("355-840-7402", "355-442-2404", "355069674978")),
                new Employee(102, "Koko", "kokoKokKari@hotmail.com", Arrays.asList("424-242-4220", "424-857-1402"))
        );
    }



}
