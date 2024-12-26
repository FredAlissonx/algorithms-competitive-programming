package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1074_EvenOrOdd {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int number = sc.nextInt();
            //if the number is zero so it will print NULL
            if(number == 0){
                System.out.println("NULL");
            }
            // number % 2 if it's equal 0 it is Even
            else if(number % 2 == 0){

                //Verify if is positive or negative
                if(number > 0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("EVEN NEGATIVE");
                }
            }
            else{
                if(number > 0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
