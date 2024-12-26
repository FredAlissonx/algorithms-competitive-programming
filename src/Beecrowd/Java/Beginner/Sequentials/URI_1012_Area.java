package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1012_Area {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159; // Pi for circle area

        double triangle = A * C / 2;
        double circle = pi * Math.pow(C, 2); // Math.pow(number, exponent)
        double trapezium = (A + B) * C / 2;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        //This is a way to print with one sout and format it
        System.out.printf(
                        "TRIANGULO: %.3f%n" +
                        "CIRCULO: %.3f%n" +
                        "TRAPEZIO: %.3f%n" +
                        "QUADRADO: %.3f%n" +
                        "RETANGULO: %.3f%n",
                triangle, circle, trapezium, square, rectangle);
    }
}
