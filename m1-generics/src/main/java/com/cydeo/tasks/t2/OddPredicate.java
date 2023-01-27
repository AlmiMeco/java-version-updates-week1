package com.cydeo.tasks.t2;

public class OddPredicate implements UnaryPredicate<Integer>{


    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;

    }
}
