package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1070_SixOddNumbers {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int six = 0;

        // start in 'n' number and run until 'six' is less than 6
        for(int i = n; six < 6; i++){
            if(i % 2 != 0){
                System.out.println(i);
                six++;// when reach in 6 the loop will stop
            }
        }
    }
}
