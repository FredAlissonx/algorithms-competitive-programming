package org.algorithms.beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class URI_1176_FibonacciArray {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // N-th term of the Fibonacci series
            long[] fib = new long[61]; // To store Fibonacci numbers up to 60th term

            fib[0] = 0; // First element of the Fibonacci series
            fib[1] = 1; // Second element of the Fibonacci series

            // Calculate Fibonacci numbers up to N
            for (int j = 2; j <= N; j++) {
                fib[j] = fib[j - 1] + fib[j - 2];
            }

            // Print the result for the N-th term of the Fibonacci series
            System.out.println("Fib(" + N + ") = " + fib[N]);
        }
        sc.close();
    }
}
