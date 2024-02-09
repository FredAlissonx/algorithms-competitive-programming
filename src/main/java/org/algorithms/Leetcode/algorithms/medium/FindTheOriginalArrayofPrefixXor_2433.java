package org.algorithms.Leetcode.algorithms.medium;

public class FindTheOriginalArrayofPrefixXor_2433 {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for(int i = 1; i < pref.length; i++){
            arr[i] = pref[i - 1] ^ pref[i];
        }

        return arr;
    }
}
