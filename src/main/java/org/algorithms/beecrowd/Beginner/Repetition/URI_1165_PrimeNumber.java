package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1165_PrimeNumber {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int number, count, testCases;
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            count = 0;
            number = sc.nextInt();
            for (int j = 2; j < number; j++) {
                if (number % j == 0){
                    count++;
                }
            }
            if (count == 0) System.out.println(number + " eh primo");
            else System.out.println(number + " nao eh primo");

        }
        sc.close();
    }
}
