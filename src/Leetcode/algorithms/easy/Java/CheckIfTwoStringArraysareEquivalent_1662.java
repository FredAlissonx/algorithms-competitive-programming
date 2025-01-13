package org.algorithms.Leetcode.algorithms.easy;

public class CheckIfTwoStringArraysareEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String i : word1)
            str1.append(i);

        for(String j : word2)
            str2.append(j);

        return str2.toString().equals(str1.toString());
    }
}
