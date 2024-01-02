package org.algorithms.beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1036_BhaskarasFormula {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // link to resource quadratic rquation(bhaskara):
        // https://www.cuemath.com/algebra/quadratic-equations/
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        //roots
        double R1, R2;

        // discriminant formula to validate
        double discriminant = Math.pow(B, 2) - 4 * A * C;

        // Validating discriminant
        // if it is true it print the message "Impossivel calcular"
        if (discriminant < 0 || A == 0.0 || B == 0.0 || C == 0.0) {

            System.out.println("Impossivel calcular");

        } else {
            // Formula to calculate Roots
            R1 = ((B * -1) + Math.sqrt(discriminant)) / (2 * A);
            R2 = ((B * -1) - Math.sqrt(discriminant)) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);

        }
    }
}
