package org.algorithms.leetcode.algorithms.easy;

import java.util.Arrays;

public class ConcatenationofArray_1929 {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len * 2];

        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 3, 4, 5, 6})));
    }
}
