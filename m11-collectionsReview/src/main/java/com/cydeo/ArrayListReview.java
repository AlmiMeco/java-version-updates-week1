package com.cydeo;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> studentArrayListFromList = Arrays.asList(
                new Student(12, "Jack"),
                new Student(12, "Jack"),
                new Student(12, "Jack"),
                new Student(12, "Jack"),
                new Student(12, "Jack")
        );



        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Fark"));
        students.add(new Student(452, "Jacque"));
        students.add(new Student(3452, "Almi"));
        students.add(new Student(215, "Toni"));



        System.out.println("Printing w/ Legacy For-Loop......................");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


        System.out.println("-----------------------------------------------------------------------------");


        System.out.println("Printing w/ Iterator......................");
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("-----------------------------------------------------------------------------");


        System.out.println("Printing w/ NEW For-Each Loop......................");
        for (Student ea : students) {
            System.out.println(ea);
        }


        System.out.println("-----------------------------------------------------------------------------");


        System.out.println("Printing w/ Lambda Loop (accept() functionalInterface)......................");
        students.forEach(p -> System.out.println(students));


        System.out.println("-----------------------------------------------------------------------------");



    }


}
