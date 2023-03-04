package com.cydeo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListReview {

    public static void main(String[] args) {


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







    }


}
