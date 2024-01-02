package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1067_OddNumbers {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n + 1; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
