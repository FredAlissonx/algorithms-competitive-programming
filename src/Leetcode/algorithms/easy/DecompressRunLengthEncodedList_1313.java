package org.algorithms.Leetcode.algorithms.easy;

import java.util.LinkedList;
import java.util.List;

public class DecompressRunLengthEncodedList_1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i + 1];

            for(int j = 0; j < freq; j++){
                list.add(val);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
