package com.cydeo.tasks.t2;

import java.util.Arrays;
import java.util.List;

public class TestCount {

    public static void main(String[] args) {


        List<Integer> ci = Arrays.asList(1,2,3,4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("# of ODD integers: " + count);


    }

    private static <T> int countIf(List<T> collection, UnaryPredicate predicate) {

        int count = 0;

        for (T element : collection){
            if (predicate.test(element)){
                ++count;
            }
        }
        return count;
    }


}
