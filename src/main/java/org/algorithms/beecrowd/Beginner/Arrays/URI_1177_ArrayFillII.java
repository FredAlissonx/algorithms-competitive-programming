package org.algorithms.beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class URI_1177_ArrayFillII {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int reserveT = 0;
        int[] arr = new int[1000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = reserveT++;
            if (reserveT == T) reserveT = 0;
        }
        for(int i = 0; i < arr.length; i++) System.out.printf("N[%d] = %d%n", i, arr[i]);
    }
}
