package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1158_SumofConsecutiveOddNumbersIII {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int sum = 0;

            int x = sc.nextInt();
            int y = sc.nextInt();

            int count = 0;
            while(count < y){
                if(x % 2 != 0){
                    sum += x; // do the sum of all odd numbers
                    count++;
                }
                x++;
            }

            System.out.println(sum);

        }
    }
}
