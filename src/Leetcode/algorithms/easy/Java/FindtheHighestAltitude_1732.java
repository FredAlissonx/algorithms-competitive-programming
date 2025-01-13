package org.algorithms.Leetcode.algorithms.easy;

public class FindtheHighestAltitude_1732 {
    public int largestAltitude(int[] gain) {
        int rest = 0;
        int altitude = 0;

        for(int climb : gain){
            altitude += climb;
            rest = Math.max(rest, altitude);
        }
        return rest;
    }
}
