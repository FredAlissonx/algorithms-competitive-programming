package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1065_PrimeNumber {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for(int i = 0; i < testCases; i++){

            int count = 0;
            int number = sc.nextInt();

            for(int j = 1; j <= number; j++){
                if(number % j == 0){
                    count++;
                }
            }

            if(count > 2) System.out.println(number + " nao eh primo");
            else System.out.println(number + " eh primo");
        }
    }
}
