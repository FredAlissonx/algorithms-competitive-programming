package org.algorithms.Beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class URI_1174_ArraySelectionI {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[100];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, arr[i]);
            }
        }
    }
}
