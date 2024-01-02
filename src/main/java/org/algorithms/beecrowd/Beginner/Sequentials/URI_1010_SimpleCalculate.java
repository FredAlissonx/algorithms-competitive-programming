package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1010_SimpleCalculate {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int codeProduct1 = sc.nextInt();
        int unitsProduct1 = sc.nextInt();
        double priceProduct1 = sc.nextDouble();

        int codeProduct2 = sc.nextInt();
        int unitsProduct2 = sc.nextInt();
        double priceProduct2 = sc.nextDouble();

        // Value to pay is equal unit of products multiplied by price, we have 2 products.
        double valueToPay = unitsProduct1 * priceProduct1 + unitsProduct2 * priceProduct2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valueToPay);
    }
}
