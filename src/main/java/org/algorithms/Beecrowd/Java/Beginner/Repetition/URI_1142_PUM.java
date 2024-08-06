package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1142_PUM {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = 1;

        for(int i = 0; i < n; i++){
            for(int j = 1; j <= 4; j++){
                if(number % 4 == 0) System.out.println("PUM");
                else System.out.print(number + " ");
                number++;
            }
        }

    }
}
