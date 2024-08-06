package org.algorithms.Beecrowd.Beginner.Selection;

import java.util.Scanner;

public class URI_1045_TriangleTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        // Temporary variable
        double temp;

        // Putting in decrease order, o that the side A is the biggest of the three sides
        if (a < b) { // if it true, we need to put temp as 'a' value
            temp = a;
            a = b; // 'a' will be the value of 'b'
            // if we did not put temp as 'a', the value of b would be wrong(value of b)
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        //If it is true, it is cannot make a triangle
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double aSquared = a * a;
            double sumSquared = b * b + c * c;

            if (aSquared == sumSquared) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (aSquared > sumSquared) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            // if 'a' is equal 'b' and 'b' is equal 'c' so they are the same side value
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
