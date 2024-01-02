package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;

public class URI_1155_SSequence {
    public static void main(String[] args) throws IOException {

        double S = 1;
        for(int i = 2; i <= 100; i++){
            S += 1.0 / i;
        }

        System.out.printf("%.2f%n", S);
    }
}
