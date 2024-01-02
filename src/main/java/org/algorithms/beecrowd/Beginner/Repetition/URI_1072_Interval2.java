package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1072_Interval2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int numberOfIntegers = sc.nextInt();
        int number;
        int sumIn = 0; // to get how many is in
        int sumOut = 0; // to get how many is out

        for (int i = 0; i < numberOfIntegers; i++) {

            number = sc.nextInt();

            if (number >= 10 && number <= 20) { // if it's in the interval of 10 and 20 (both included)
                sumIn++;
            } else {
                sumOut++;
            }
        }

        System.out.println(sumIn + " in");
        System.out.println(sumOut + " out");

        sc.close();
    }
}
