package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1035_SelectionTest1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // if B is greater than C and D is greater than A and if the sum of C and D is greater than the sum
        // of A and B and if C and D were positives values and if A is even is true and print "Valores aceitos"
        // Otherwise is false and print "Valores nao aceitos"
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
