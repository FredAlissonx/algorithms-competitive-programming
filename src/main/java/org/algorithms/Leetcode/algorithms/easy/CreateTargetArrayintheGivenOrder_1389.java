package org.algorithms.Leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> mylist = new ArrayList<>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            mylist.add(index[i],nums[i]);
        }
        for (int i = 0; i < arr.length;i++){
            arr[i] = mylist.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
    }
}
