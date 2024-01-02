package org.algorithms.beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1043_Triangle {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        // To validate if exists a triangle
        if (A + B > C && A + C > B && B + C > A) {
            // Perimeter is the sum of all sides
            float perimeter = A + B + C;
            System.out.println("Perimetro = " + perimeter);
        } else {
            // The area of trapezium is the base(sum of sides A and B) multiplied
            // by Height(C) divided by 2
            float area = (A + B) * C / 2;
            System.out.println("Area = " + area);
        }
    }
}
