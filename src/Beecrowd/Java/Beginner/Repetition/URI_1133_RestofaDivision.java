package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1133_RestofaDivision {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // set 'x' as bigger and 'y' as lower
        if(x < y){
            int temp = y;
            y = x;
            x = temp;
        }
        for(int i = y + 1; i < x; i++){
            if(i % 5 == 2 || i % 5 == 3){ // check if the number rest by 5 is 2 or 3
                System.out.println(i);
            }
        }
        sc.close();
    }
}
