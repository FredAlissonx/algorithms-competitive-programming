package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1115_Quadrant {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while(true){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 || y == 0) break;

            if(x > 0 && y > 0) System.out.println("primeiro");
            else if(x > 0) System.out.println("quarto");
            else if(y < 0) System.out.println("terceiro");
            else System.out.println("segundo");

        }


    }
}
