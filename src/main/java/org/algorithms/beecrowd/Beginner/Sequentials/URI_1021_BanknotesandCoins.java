package org.algorithms.beecrowd.Beginner.Sequentials;

import java.util.Scanner;

public class URI_1021_BanknotesandCoins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float monetaryValue = sc.nextFloat();

        // Using cast we can get the int value of monetaryValue divided by 100
        int notes100 = (int) monetaryValue / 100;
        // Once we got the int value, we need to cut it using module to the rest
        monetaryValue %= 100.0;

        int notes50 = (int) monetaryValue / 50;
        monetaryValue %= 50.0;

        int notes20 = (int) monetaryValue / 20;
        monetaryValue %= 20.0;

        int notes10 = (int) monetaryValue / 10;
        monetaryValue %= 10.0;

        int notes5 = (int) monetaryValue / 5;
        monetaryValue %= 5.0;

        int notes2 = (int) monetaryValue / 2;
        monetaryValue %= 2.0;

        int coin1 = (int) monetaryValue;
        monetaryValue %= 1;

        int coin50 = (int) (monetaryValue / 0.5);
        monetaryValue %= 0.5;

        int coin25 = (int) (monetaryValue / 0.25);
        monetaryValue %= 0.25;

        int coin10 = (int) (monetaryValue / 0.1);
        monetaryValue %= 0.1;

        int coin05 = (int) (monetaryValue / 0.05);
        monetaryValue %= 0.05;

        // Math.round does the rounding of operation to get coins 0.01, doing cast
        int coin01 = (int) Math.round(monetaryValue / 0.01);

        System.out.println("NOTAS:");
        System.out.println(notes100 + " nota(s) de R$ 100.00");
        System.out.println(notes50 + " nota(s) de R$ 50.00");
        System.out.println(notes20 + " nota(s) de R$ 20.00");
        System.out.println(notes10 + " nota(s) de R$ 10.00");
        System.out.println(notes5 + " nota(s) de R$ 5.00");
        System.out.println(notes2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(coin1 + " moeda(s) de R$ 1.00");
        System.out.println(coin50 + " moeda(s) de R$ 0.50");
        System.out.println(coin25 + " moeda(s) de R$ 0.25");
        System.out.println(coin10 + " moeda(s) de R$ 0.10");
        System.out.println(coin05 + " moeda(s) de R$ 0.05");
        System.out.println(coin01 + " moeda(s) de R$ 0.01");
    }
}
