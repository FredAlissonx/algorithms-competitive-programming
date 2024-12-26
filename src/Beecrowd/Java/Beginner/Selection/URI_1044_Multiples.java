package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1044_Multiples {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // Ternary way if one of these condition is True, it will print "Sao multiplos"
        // if not it will print "Nao sao Multiplo"
        String mult = A % B == 0 || B % A == 0 ? "Sao Multiplos" : "Nao sao Multiplos";

        System.out.println(mult);
    }
}
