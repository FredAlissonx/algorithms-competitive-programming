package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1099_SumOfConsecutiveOddNumbers2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int oddSum = 0;

            // We verify if 'n1' is greater than 'n2', if it is true, will replace the values
            // 'n1' supposed to be less than 'n2' to use in a simple for looping
            if(n1 > n2){
                int nm = n1;
                n1 = n2;
                n2 = nm;
            }
            // A new loop to get the Odd numbers and sum on 'oddSum'
            for(int j = n1 + 1; j < n2; j++){
                if(j % 2 != 0){
                    oddSum += j;
                }
            }
            System.out.println(oddSum);
        }

    }
}
