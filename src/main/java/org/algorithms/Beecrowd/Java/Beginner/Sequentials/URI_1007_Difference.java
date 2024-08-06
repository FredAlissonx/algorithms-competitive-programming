package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1007_Difference {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int difference = n1 * n2 - n3 * n4; // Difference between the product of n1 and n2 to n3 and n4

        System.out.println("DIFERENCA = " + difference);
    }
}
