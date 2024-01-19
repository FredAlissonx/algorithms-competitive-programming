package org.algorithms.leetcode.algorithms.easy;

public class TruncateSentence_1816 {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < k; i++){
            if(i > 0)
                str.append(" ");
            str.append(arr[i]);
        }

        return str.toString();
    }
}
