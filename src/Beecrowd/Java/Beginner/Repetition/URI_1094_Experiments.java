package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1094_Experiments {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int coelhoAmount = 0;
        int ratoAmount = 0;
        int sapoAmount = 0;
        int totalAnimalsUsed = 0;
        double coelhoPercentual = 0.0;
        double ratoPercentual = 0.0;
        double sapoPercentual = 0.0;

        for(int i = 0; i < n; i++){
            int amount = sc.nextInt();
            char character = sc.next().charAt(0); // To read the char

            // verify if the 'character' and increment the 'amount' if it is
            if (character == 'C') coelhoAmount += amount;
            else if (character == 'R') ratoAmount += amount;
            else if(character == 'S') sapoAmount += amount;

            // to get the total
            totalAnimalsUsed += amount;
        }

        coelhoPercentual = (double)coelhoAmount / totalAnimalsUsed * 100;
        ratoPercentual = (double)ratoAmount / totalAnimalsUsed * 100;
        sapoPercentual = (double)sapoAmount / totalAnimalsUsed * 100;

        System.out.println("Total: " + totalAnimalsUsed + " cobaias");
        System.out.println("Total de coelhos: " + coelhoAmount);
        System.out.println("Total de ratos: " + ratoAmount);
        System.out.println("Total de sapos: " + sapoAmount);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", coelhoPercentual) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ratoPercentual) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", sapoPercentual) + " %");

    }
}
