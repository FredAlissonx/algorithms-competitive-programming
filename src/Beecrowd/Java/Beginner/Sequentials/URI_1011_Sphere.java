package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1011_Sphere {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        final double PI = 3.14159;

        // volume sphere formula is  (4 / 3) * PI * radius^3 'radius^3 it is like radius * radius * radius'
        // wiht Math.pow(variable, exponent) we can simplify the formula
        double volumeSphere = (4.0 / 3.0) * PI * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f%n", volumeSphere);

    }
}
