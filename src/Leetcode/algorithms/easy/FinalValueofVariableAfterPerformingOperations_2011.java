package org.algorithms.Leetcode.algorithms.easy;

public class FinalValueofVariableAfterPerformingOperations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(String str : operations){
            switch(str){
                case "++X" -> ++x;
                case "X++" -> x++;
                case "--X" -> --x;
                case "X--" -> x--;
            }
        }
        return x;
    }
}
