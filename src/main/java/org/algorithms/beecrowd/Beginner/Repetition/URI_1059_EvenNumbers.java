package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1059_EvenNumbers {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        /**You can solve this with one line of code with simplified for(Is used when we have just 1
        condition/line of code inside)*/

        /**Explain: i % 2 get the rest, if the number is Even it will rest zero then it is True, so we can print i that
         is the even number*/
        for(int i = 1; i < 101; i++) if(i % 2 == 0) System.out.println(i);

    }
}
