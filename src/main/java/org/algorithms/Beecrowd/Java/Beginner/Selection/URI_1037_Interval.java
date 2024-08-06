package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1037_Interval {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        // If it's not true it  won't execute another If, If not execute another Ifs
        if(number < 0 || number > 100){
            System.out.println("Fora de intervalo");
        }
        // We know that number is already greater than 0 by the first If, so we validate if is
        // greater than 25 and the rest
        else if(number <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if(number <= 50){
            System.out.println("Intervalo (25,50]");
        }
        else if(number <= 75){
            System.out.println("Intervalo (50,75]");
        }
        // If any If is true, execute this
        else{
            System.out.println("Intervalo (75,100]");
        }
    }
}
