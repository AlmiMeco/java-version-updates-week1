package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

//        |Creating Stream from Array|
        String[] courses = {"Java", "spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

//        |Creating Stream from Collection (List)|
        List<String> list = Arrays.asList("Java", "spring", "Agile");
        Stream<String> streamList = list.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 101),
                new Course("Python", 102),
                new Course("Agile-Scrum", 103)
        );



//        |Creating stream from (.stream() method) existing collection |
        Stream<Course> myCourseStream = myCourses.stream();


//        |Creating stream from (Stream.of() method) new/un-instantiated collection|
        Stream<Integer> stream = Stream.of(1,2,2,231,411,41);









    }
}