package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        |Creating Stream from Array|
        String[] courses = {"Java", "spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

//        |Creating Stream from Collection|
        List<String> list = Arrays.asList("Java", "spring", "Agile");
        Stream<String> streamList = list.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 101),
                new Course("Python", 102),
                new Course("Agile-Scrum", 103)
        );

        Stream<Course> myCourseStream = myCourses.stream();





    }
}