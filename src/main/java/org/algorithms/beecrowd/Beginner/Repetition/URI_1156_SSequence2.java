package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;

public class URI_1156_SSequence2 {
    public static void main(String[] args) throws IOException {

        double S = 1.0;
        double n1 = 3.0;
        double n2 = 2.0;

        // while n1 is lower than 39
        while(n1 < 39){
            S += n1 / n2;
            n1 += 2.0;
            n2 *= 2.0;
        }
        System.out.printf("%.2f%n", S);
    }
}
