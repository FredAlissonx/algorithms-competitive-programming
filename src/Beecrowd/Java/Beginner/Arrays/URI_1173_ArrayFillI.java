package org.algorithms.Beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class URI_1173_ArrayFillI {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = n;

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] * 2;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf("N[%d] = %d%n", i, arr[i]);
        }

    }
}
