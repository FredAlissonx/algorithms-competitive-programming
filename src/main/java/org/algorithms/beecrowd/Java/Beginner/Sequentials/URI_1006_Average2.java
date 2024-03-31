package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1006_Average2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double media = (a * 2 + b * 3 + c * 5) / 10.0; // Media is equal the product a, b and c divided by the weight total (10)

        System.out.printf("MEDIA = %.1f%n", media); // Formatted output
    }
}
