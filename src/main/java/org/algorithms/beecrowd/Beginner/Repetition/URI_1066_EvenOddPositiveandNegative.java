package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1066_EvenOddPositiveandNegative {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positive = 0;
        int negative = 0;

        // To read a number until 5
        for(int i = 0; i < 5; i++){

            int number = sc.nextInt();

            if(number > 0){
                positive++;
            }else if(number < 0){
                negative++;
            }
            // rest of 2 is equal 0
            if(number % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
