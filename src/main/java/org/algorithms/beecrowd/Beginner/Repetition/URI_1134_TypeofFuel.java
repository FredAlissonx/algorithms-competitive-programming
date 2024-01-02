package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1134_TypeofFuel {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        do{
            int choose = sc.nextInt();
            if (choose == 1) alcool++;
            else if (choose == 2) gasolina++;
            else if (choose == 3) diesel++;
            else if (choose == 4) break;
        }while (true);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
