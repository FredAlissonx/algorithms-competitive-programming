package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1151_EasyFibonacci {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int earlyNumber = 0;
        int afterNumber = 1;
        int result;

        System.out.print(0 + " " + 1);

        for(int i = 0; i < n - 2; i++){

            result = earlyNumber + afterNumber;
            System.out.print(" " + result);
            earlyNumber = afterNumber;
            afterNumber = result;

        }
        System.out.println();
    }
}
