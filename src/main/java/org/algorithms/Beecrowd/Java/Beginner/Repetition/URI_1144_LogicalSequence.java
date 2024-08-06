package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1144_LogicalSequence {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;
        int j = 1;
        int count = 2;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && k % 2 == 0 || i % 2 != 0 && k % 2 != 0){
                j = i * k;
            }

            System.out.println(i + " " + k + " " + j);
            if (k != 2 && j != 2){
                k++;
                j++;
            }

            System.out.println(i + " " + k + " " + j);
            k += count;
            count += 2;
        }

    }

}
