package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1154_Ages {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double average;
        int sum = 0;
        int numberOfAges = 0;

        while(true){
            int number = sc.nextInt();

            if(number >= 0){
                sum += number;
                numberOfAges++;
            }
            else{
                break;
            }
        }
        average = (double)sum / numberOfAges;

        System.out.printf("%.2f%n", average);
    }
}
