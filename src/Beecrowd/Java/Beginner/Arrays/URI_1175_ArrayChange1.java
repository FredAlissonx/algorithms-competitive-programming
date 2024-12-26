package org.algorithms.Beecrowd.Beginner.Arrays;

import java.io.IOException;
import java.util.Scanner;

public class URI_1175_ArrayChange1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] N = new int[20]; // Array of size 20

        //i = N.length - 1 it is like i = 20 - 1 that is 19, so we decrement the i to reach a 0 index of array
        for(int i = N.length - 1; i >= 0; i--){

            N[i] = sc.nextInt(); // Reads 20 elements in the i place of array

        }
        for(int j = 0; j < N.length; j++){

            System.out.printf("N[%d] = %d%n", j, N[j]); // Prints all elements according to the example

        }
    }
}
