package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1013_TheGreatest {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2; // Formula to get the greatest number is A or B

        if (c > maiorAB){ // if c variable is greater than maiorAB
            System.out.println(c + " eh o maior");
        }else{
            System.out.println(maiorAB + " eh o maior");
        }

    }
}
