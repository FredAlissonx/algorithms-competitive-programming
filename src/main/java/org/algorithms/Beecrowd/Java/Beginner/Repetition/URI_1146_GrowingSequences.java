package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1146_GrowingSequences {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true){

            int n = sc.nextInt();

            if(n == 0) break;

            // start with 1 and end with n without the space
            for(int i = 1; i <= n; i++){

                // Verify if 'i' is equal 'n' if it is it will print 'i' without space
                if(i != n) System.out.print(i + " ");
                else System.out.println(i);

            }

        }

    }
}
