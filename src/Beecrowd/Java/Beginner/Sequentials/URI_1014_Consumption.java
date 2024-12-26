package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1014_Consumption {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int totalDistance = sc.nextInt();
        double spentFuelTotal = sc.nextDouble();
        double consumption = totalDistance / spentFuelTotal; //formula to calculate the consumption

        System.out.printf("%.3f km/l%n", consumption);
    }
}
