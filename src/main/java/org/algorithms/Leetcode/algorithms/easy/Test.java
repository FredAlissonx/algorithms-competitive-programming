package org.algorithms.Leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(numberGame(new int[]{5,4,2,3}));
    }
    public static String numberGame(int[] nums) {
        int[] arr = new int[nums.length];

        List<Integer> list = new ArrayList(Arrays.asList(nums));
        Collections.sort(list);

        for(int i = 0; i < list.size(); i+=2){
            int alice = list.get(i);
            int bob = list.get(i + 1);
            arr[i] = bob;
            arr[i + 1] = alice;
        }

        return Arrays.toString(arr);
    }
}
