package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI_1118_SeveralScoreswithValidation {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true){

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double media;

            while (n1 < 0 || n1 > 10){
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }
            while (n2 < 0 || n2 > 10){
                System.out.println("nota invalida");
                n2 = sc.nextDouble();
            }

            media = (n1 + n2) / 2.0;
            System.out.println("media = " + String.format("%.2f", media));

            System.out.println("novo calculo (1-sim 2-nao)");
            int option = sc.nextInt();

            while (option != 1 && option != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                option = sc.nextInt();
            }

            if (option == 2) break;

        }
    }
}
