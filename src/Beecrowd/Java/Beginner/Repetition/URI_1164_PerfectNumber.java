package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1164_PerfectNumber {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int sum = 0;
            int number = sc.nextInt();

            for(int j = 1; j < number; j++){
                sum += j;
                // if 'sum' is equal 'number' so will break
                if(sum == number) break;
            }

            if(sum == number) System.out.println(number + " eh perfeito");
            else System.out.println(number + " nao eh perfeito");
        }

    }
}
