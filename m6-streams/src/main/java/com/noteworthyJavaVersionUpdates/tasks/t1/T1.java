package com.noteworthyJavaVersionUpdates.tasks.t1;

import java.util.Arrays;
import java.util.List;

/**Given a list of words, print the number of characters for each word.
 **/

public class T1 {


    public static void main(String[] args) {


        List<String> words = Arrays.asList("JAVA","APPLE","HONDA", "DEVELOPER");

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);




    }



}
