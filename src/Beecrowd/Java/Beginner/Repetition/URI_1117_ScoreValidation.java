package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1117_ScoreValidation {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        // when validate that 'n1' and 'n1' is correct it will break
        while(true){
            if(n1 < 0 || n1 > 10){
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }
            if(n2 < 0 || n2 > 10){
                System.out.println("nota invalida");
                n2 = sc.nextDouble();
            }
            //verifying if 'n1' and 'n2' is right
            if(n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10){
                double average = (n1 + n2) / 2;
                System.out.println("media = " + String.format("%.2f", average));
                break; //break the loop
            }
        }

    }
}
