package org.algorithms.Leetcode.algorithms.medium;

public class FindtheDuplicateNumber_287 {
    public static int findDuplicate(int[] nums) {
        int number = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    number = nums[j];
                    return number;
                }
            }
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
}
