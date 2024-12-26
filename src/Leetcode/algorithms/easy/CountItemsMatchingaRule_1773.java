package org.algorithms.Leetcode.algorithms.easy;

import java.util.List;

public class CountItemsMatchingaRule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> list : items){
            if(ruleKey.equals("type") && list.get(0).equals(ruleValue))
                count++;
            else if(ruleKey.equals("color") && list.get(1).equals(ruleValue))
                count++;
            else if(ruleKey.equals("name") && list.get(2).equals(ruleValue))
                count++;
        }
        return count;
    }
}
