package com.cydeo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {


        Set<Student> studentSet = new LinkedHashSet<>();
        studentSet.add(new Student(21, "Fark"));
        studentSet.add(new Student(452, "Jacque"));
        studentSet.add(new Student(3452, "Almi"));
        studentSet.add(new Student(215, "Toni"));


//        |Iterating each element of Set (simple print)|
        System.out.println(studentSet);


        System.out.println("--------------------------------------");
        String str = "Java Developer";

        System.out.println(firstRepeatingChar(str));

    }


        /** Solving Algorithm Problem (First Repeating Char in a String) w/ HashSet (non repeating elements only) **/
    private static Character firstRepeatingChar(String str){
        Set<Character> charachterSet = new HashSet<>(); // creating HashSet (unique only)

        for (char eachCharachter : str.toCharArray()) {  // iterating each Char of 'str' -> as charArray
            if (!charachterSet.add(eachCharachter)) {return eachCharachter;} // if eachChar !add into charachterSet (duplicate) ->
        }
      return null;
    }

}
