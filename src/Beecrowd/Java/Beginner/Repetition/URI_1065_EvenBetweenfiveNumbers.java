package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1065_EvenBetweenfiveNumbers {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int number;
        int countEvenNumbers = 0; // To count how many even numbers are

        for(int i = 0; i < 5; i++){
            number = sc.nextInt();

            if(number % 2 == 0){ // To get even numbers
                countEvenNumbers++;
            }
        }
        System.out.println(countEvenNumbers + " valores pares");
    }
}
