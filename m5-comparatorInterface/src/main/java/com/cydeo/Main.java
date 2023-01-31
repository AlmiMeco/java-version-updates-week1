package com.cydeo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 2, 36, 4, 52, 6);

//        |Ascending Order|
        Collections.sort(list);
        System.out.println(list);

//        |Descending Order|
        Collections.sort(list , new MCLASS());
        System.out.println(list);

//        |Descending Order w/ Lambda|
        Collections.sort(list, ( (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0) );
        System.out.println(list);

//        |Ascending Order using .compareTo() method|
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);
    }


}
