package org.algorithms.Leetcode.algorithms.easy;

public class MaximumNumberofWordsFoundinSentences_2114 {
    public int mostWordsFound(String[] sentences) {
        int countWords = 0;

        for(String sentence : sentences){
            String[] fields = sentence.split(" ");
            if(fields.length > countWords)
                countWords = fields.length;
        }
        return countWords;
    }
}
