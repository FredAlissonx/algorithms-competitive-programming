package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1047_GameTimeWithMinutes {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        // Transforming in minutes spend
        int temp = ((endHour*60)+endMinute)-((startHour*60)+startMinute);

        //if minutes spend is less or equal 0 then 24 * 60 will be the minutes
        if(temp <= 0){
            temp += 24 * 60;
        }

        //get only the integer part of operation
        int hour = temp / 60;

        //get the rest of operation
        int minute = temp % 60;

        System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + minute + " MINUTO(S)");
    }
}
