package org.algorithms.beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1046_GameTime {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        // we must have to initialize
        int duration = 0;

        if(startTime == endTime){
            duration = 24;
        }else if(startTime > endTime){
            duration = 24 - (startTime - endTime);
        }else{
            duration = endTime - startTime;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
    }
}
