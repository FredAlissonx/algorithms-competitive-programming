package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1160_PopulationIncrease {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = scanner.nextInt();
            int PB = scanner.nextInt();
            double G1 = scanner.nextDouble();
            double G2 = scanner.nextDouble();
            int years = 0;

            while (PA <= PB) {
                PA += (int) (PA * (G1 / 100));
                PB += (int) (PB * (G2 / 100));
                years++;

                if (years > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }

            if (years <= 100) {
                System.out.println(years + " anos.");
            }
        }
        scanner.close();
    }
}
