package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1079_WeightedAverages {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();

            // average with weight for each case
            float average = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

            System.out.printf("%.1f%n", average);
        }
    }
}
