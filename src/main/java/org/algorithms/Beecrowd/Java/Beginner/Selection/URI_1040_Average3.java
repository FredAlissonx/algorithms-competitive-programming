package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1040_Average3 {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);

        // Float is single accuracy
        float n1, n2, n3, n4,n5, average;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        average =(n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;

        if (average >= 7.0) {

            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno aprovado.");

        }

        else if (average >= 5 && average < 7) {

            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno em exame.");

            n5 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n",n5);
            average =(average + n5) / 2;

            if (average >= 5.0) {
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", average);

        }

        else if (average < 5.0) {

            System.out.printf("Media: %.1f%n",average);
            System.out.println("Aluno reprovado.");

        }
    }

}
