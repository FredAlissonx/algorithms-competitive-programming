package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1018_BankNotes {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int i = value; // to get rest of operations, we're going to use % operator to get the rest
        int hundred = i / 100; // Quantities of 100 dollars
        i %= 100; // get the rest of i(value) divided by 100

        int fifth = i / 50; // rest of i / 100 divided by 50 to get 50 notes
        i %= 50;

        int twenty = i / 20;
        i %= 20;

        int ten = i / 10;
        i %= 10;

        int five = i / 5;
        i %= 5;

        int two = i / 2;
        i %= 2;

        int one = i; // The last one would be different than i so we dont need to get the rest of 1

        System.out.println(value);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifth + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");


    }
}
