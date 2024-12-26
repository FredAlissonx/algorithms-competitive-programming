package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1153_SimpleFactorial {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = n;

        for(int i = 1; i < n; i++){
            fact *= i; // To calculate our factorial 'fact' = 'fact' * 'i'
        }

        System.out.println(fact);

    }
}
