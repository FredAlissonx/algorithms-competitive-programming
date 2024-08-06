package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1051_Taxes {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();

        if(n >= 0f && n <= 2000f){
            System.out.println("Isento");
        }else if(n <= 3000f){
            float tax = (n % 2000f) * 0.08f;
            System.out.printf("R$ %.2f%n", tax);
        }else if(n <= 4500f){
            float tax = 1000f * 0.08f + n % 3000f * 0.18f;
            System.out.printf("R$ %.2f%n", tax);
        }else{
            float tax = 1000f * 0.08f + 1500f * 0.18f + (n - 4500f) * 0.28f;
            System.out.printf("R$ %.2f%n", tax);
        }
    }
}
