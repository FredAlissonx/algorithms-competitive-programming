package org.algorithms.beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1041_CoordinatesOfPoint {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        // We will use nested ternary
        // Source of nested ternary: https://www.baeldung.com/java-ternary-operator
        String quadrant = (n1 == 0 && n2 == 0) ? "Origem"
                : (n1 == 0) ? "Eixo Y"
                : (n2 == 0) ? "Eixo X"
                : (n1 > 0 && n2 > 0) ? "Q1"
                : (n1 < 0 && n2 > 0) ? "Q2"
                : (n1 < 0 && n2 < 0) ? "Q3"
                : "Q4";

        System.out.println(quadrant);
        sc.close();
    }
}
