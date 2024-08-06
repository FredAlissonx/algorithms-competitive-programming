package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1075_Remaining2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10000; i++){
            //The rest of 'i' divided by 'n'
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}
