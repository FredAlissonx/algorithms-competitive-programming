package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1005_Average1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double average = (n1 * 3.5 + n2 * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", average);
    }
}
