package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1071_SumofConsecutiveOddNumbersI {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        // We verify if 'n1' is greater than 'n2', if it is true, will replace the values
        // n1 supposed to be less than n2 to use in a simple for looping
        if(n1 > n2){
            int n = n1;
            n1 = n2;
            n2 = n;
        }

        // With the early verification, we can assume that n1 is greater than n2
        //int i = n1 + 1 cuz 'n1' and 'n2' is not included
        for (int i = n1 + 1; i < n2; i++){
            if (i % 2 != 0){
                sum += i; // to sum sum all odd numbers
            }
        }
        System.out.println(sum);
    }
}
