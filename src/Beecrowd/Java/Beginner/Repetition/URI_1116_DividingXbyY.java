package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1116_DividingXbyY {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            // verify it is possible
            if(y == 0){
                System.out.println("divisao impossivel");
            }
            else{
                // in Java division between two integers number we need to do a cast
                double result = (double)x / y;
                System.out.printf("%.1f%n", result);
            }
        }
    }
}
