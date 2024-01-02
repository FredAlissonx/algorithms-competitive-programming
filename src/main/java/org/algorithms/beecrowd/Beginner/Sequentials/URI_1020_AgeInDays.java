package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1020_AgeInDays {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int year = days / 365; // to get years
        days %= 365;

        int month = days / 30; // to get the months
        days %= 30; // to get the days

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");

    }
}
