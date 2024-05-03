package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1002_AreaOfACircle {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        final double R = sc.nextDouble(); //input constant
        final double PI = 3.14159; // value of PI
        final double A = PI * Math.pow(R, 2); // With Math.pow(variable, number) we can simplify, but it is like PI * R * R

        System.out.printf("A=%.4f%n", A);

    }
}
