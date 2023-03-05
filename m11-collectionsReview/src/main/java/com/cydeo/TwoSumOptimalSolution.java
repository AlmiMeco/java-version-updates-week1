package com.cydeo;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimalSolution {


//    [ O(n) ]
    public static int[] twoSumOptimal(int[] array, final int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array[i];

            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);
        }


        return new int[]{};
    }


}
