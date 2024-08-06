package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1159_SumofConsecutiveEvenNumbers {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while(true){

            int five = 0;
            int sum = 0;
            int x = sc.nextInt();

            if(x == 0) break;

            // looping until five
            for(int i = x; five < 5; i++){
                if(i % 2 == 0){
                    sum += i;
                    five++;
                }
            }
            System.out.println(sum);
        }

    }
}
