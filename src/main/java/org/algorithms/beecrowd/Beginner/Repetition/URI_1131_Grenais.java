package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1131_Grenais {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int numberOfScoreInter, numberOfScoreGremio;

        int winsInter = 0, winsGremio = 0, draws = 0, grenais = 0;

        while(true){
            numberOfScoreInter = sc.nextInt();
            numberOfScoreGremio = sc.nextInt();
            grenais++;

            if(numberOfScoreInter > numberOfScoreGremio) winsInter++;
            else if(numberOfScoreInter < numberOfScoreGremio) winsGremio++;
            else draws++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int option = sc.nextInt();

            if(option == 2) break;

        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + winsInter);
        System.out.println("Gremio:" + winsGremio);
        System.out.println("Empates:" + draws);

        if(winsInter > winsGremio) System.out.println("Inter venceu mais");
        else if(winsInter < winsGremio) System.out.println("Gremio venceu mais");
        else System.out.println("Empate");
    }
}
