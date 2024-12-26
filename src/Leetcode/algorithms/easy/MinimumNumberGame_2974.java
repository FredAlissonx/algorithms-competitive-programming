package org.algorithms.Leetcode.algorithms.easy;

import java.util.Arrays;

public class MinimumNumberGame_2974 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length - 1; i+=2){
            arr[i] = nums[i + 1];
            arr[i + 1] = nums[i];
        }

        return arr;
    }
}
