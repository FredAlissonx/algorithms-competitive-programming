package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1073_EvenSquare {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                int result = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + result);
            }
        }
    }
}
