package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1016_Distance {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 1km for each 2 minutes is equal distance multiplied by 2
        int distance = sc.nextInt();

        System.out.println(distance * 2 + " minutos");
    }
}
