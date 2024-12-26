package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1101_SequenceofNumbersandSum {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        // an infinite loop(if some number is less or equal 0 it will stop)
        while(true){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            int sum = 0; // start a variable to store the sum

            // verify if 'n1' or 'n2' is less or equal, if it is true will break the loop
            if(n1 <= 0 || n2 <= 0){
                break;
            }
            // changing values if 'n1' is greater than 'n2'
            else if(n1 > n2){
                int n3 = n2;
                n2 = n1;
                n1 = n3;
            }
            // looping starting in 'n1' value until 'n2'(included)
            for(int i = n1; i <= n2; i++){
                sum += i; // sum the value
                System.out.print(i + " "); // printing like the output example
            }
            // we need to print sum out of for loop
            System.out.println("Sum=" + sum);
        }
    }
}
