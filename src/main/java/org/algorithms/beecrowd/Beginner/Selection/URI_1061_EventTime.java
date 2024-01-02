package org.algorithms.beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1061_EventTime {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Read beginning day and time
        sc.next(); // Ignore "Dia"
        int startDay = sc.nextInt();
        String startTime = sc.next(); // Read and ignore "Hora"
        sc.next(); // Ignore ":"
        String startMin = sc.next(); // Read and ignore "Minuto"
        sc.next(); // Ignore ":"
        String startSec = sc.next(); // Read and ignore "Segundo"

        // Read end day and time
        sc.next(); // Ignore "Dia"
        int endDay = sc.nextInt();
        String endTime = sc.next(); // Read and ignore "Hora"
        sc.next(); // Ignore ":"
        String endMin = sc.next(); // Read and ignore "Minuto"
        sc.next(); // Ignore ":"
        String endSec = sc.next(); // Read and ignore "Segundo"

        // Calculate total time in seconds
        int totalStartSec = Integer.parseInt(startSec) + Integer.parseInt(startMin) * 60 + Integer.parseInt(startTime) * 3600 + startDay * 86400;
        int totalEndSec = Integer.parseInt(endSec) + Integer.parseInt(endMin) * 60 + Integer.parseInt(endTime) * 3600 + endDay * 86400;

        int durationSec = totalEndSec - totalStartSec;

        // Calculate days, hours, minutes, and seconds
        int days = durationSec / 86400;
        durationSec %= 86400;
        int hours = durationSec / 3600;
        durationSec %= 3600;
        int minutes = durationSec / 60;
        int seconds = durationSec % 60;

        // Print the result
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");

        sc.close();
    }
}
