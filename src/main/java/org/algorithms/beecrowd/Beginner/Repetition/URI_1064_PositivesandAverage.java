package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1064_PositivesandAverage {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double sum = 0.0; // Sum to get the sum of all positive values
        int positiveNumbers = 0; // Number of positives values to increment
        double average;
        for (int i = 0; i < 6; i++) {
            double number = sc.nextDouble();

            if (number > 0) { // Positive numbers is numbers that are greater than 0
                sum += number; // sum = sum + number;
                positiveNumbers++;
            }
        }

        average = sum / positiveNumbers; // To get the average is: totalValue divided by total units - sum / positiveNumbers
        System.out.println(positiveNumbers + " valores positivos");
        System.out.printf("%.1f%n", average);

    }
}
