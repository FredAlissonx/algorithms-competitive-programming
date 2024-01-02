package org.algorithms.beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class URI_1172_ArrayReplacementI {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0) arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("X[%d] = %d\n", i, arr[i]);
        }
    }
}
