package org.algorithms.leetcode.algorithms.easy;

import java.util.List;

public class SumofValuesatIndicesWithKSetBits_2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        String binary;
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            int count = 0;
            binary = Integer.toBinaryString(i);

            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(j) == '1'){
                    count++;
                }
            }
            if(count == k)
                sum += nums.get(i);
        }
        return sum;
    }
}
