package org.algorithms.beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI_1178_ArrayFillIII {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double[] arr = new double[100];

        arr[0] = x;
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] / 2.0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, arr[i]);
        }
    }
}
