package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1019_TimeConversion {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int durationSeconds = sc.nextInt();
        int hours = durationSeconds / 3600; // an hour is equal 3600 seconds

        durationSeconds %= 3600; // to get the rest of an hour

        int minutes = durationSeconds / 60; // a minute is equal 60 seconds
        int seconds = durationSeconds %= 60; // to get the seconds

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
