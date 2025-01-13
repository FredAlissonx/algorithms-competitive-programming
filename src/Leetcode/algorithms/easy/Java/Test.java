package org.algorithms.Leetcode.algorithms.easy;

public class Test {
    public static void main(String[] args) {
        System.out.println(numberGame("Mr John Smith  ,"));
    }
    public static String numberGame(String phrase) {
        char[] newPhrase = phrase.toCharArray();
        for(int i = 0; i < newPhrase.length; i++){
            if(newPhrase[i] == ' '){
                phrase.trim().replace(" ", "%20");
            }
        }
        return newPhrase.toString();
    }
}
