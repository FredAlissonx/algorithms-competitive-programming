package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1017_FuelSpent {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int spentTime = sc.nextInt();
        int averageSpeed = sc.nextInt();
        double litersNeeded = averageSpeed * spentTime / 12.0;

        System.out.printf("%.3f%n", litersNeeded);

    }
}
