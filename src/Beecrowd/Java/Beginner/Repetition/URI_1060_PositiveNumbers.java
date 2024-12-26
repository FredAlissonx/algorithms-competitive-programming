package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1060_PositiveNumbers {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int positiveNumbers = 0; //Initialization a variable with zero to get the number of positives

        for(int i = 0; i < 6; i++){

            double number = sc.nextDouble();

            if(number > 0){ // If the number is greater than 0 is positive
                positiveNumbers++; // We increment 1 for each number greater than 0
            }
        }

        System.out.println(positiveNumbers + " valores positivos");

    }
}
