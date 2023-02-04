package com.cydeo.tasks.flatMapTask;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor


public class Employee {


    private int empID;
    private String empName, empEmail;
    private List<String> empPhoneNumbers;


}
