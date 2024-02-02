package org.algorithms.Leetcode.algorithms.easy;

public class LeftandRightSumDifferences_2574 {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int[] answear = new int[len];

        leftSum[0] = 0;
        rightSum[len - 1] = 0;

        int left = leftSum[0];
        int right = rightSum[len - 1];

        for (int i = 1; i < len; i++) {
            left += nums[i - 1];
            right += nums[len - i];
            leftSum[i] = left;
            rightSum[len - i - 1] = right;
        }

        for (int i = 0; i < len; i++) {
            answear[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answear;
    }
}
