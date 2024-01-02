package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1143_SquaredandCubic {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
        }
    }
}
