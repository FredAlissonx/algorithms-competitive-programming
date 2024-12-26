package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1038_Snack {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int productCode = sc.nextInt();
        int productQuantity = sc.nextInt();

        // To get the total we can just do an enhanced switch
        double total = switch (productCode) {
            case 1 -> productQuantity * 4.0; // if code is 1, productQuantity multiplied by 4.0
            case 2 -> productQuantity * 4.50; // if code is 2, productQuantity multiplied by 4.0 ...
            case 3 -> productQuantity * 5.0;
            case 4 -> productQuantity * 2.0;
            case 5 -> productQuantity * 1.50;
            default -> 0; // To use this variable at the end of code we need to initialize it
        };
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
