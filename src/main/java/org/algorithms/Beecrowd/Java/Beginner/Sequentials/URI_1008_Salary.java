package org.algorithms.Beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1008_Salary {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int hourWorked = sc.nextInt();
        double amountPerHour = sc.nextDouble();
        double salary = hourWorked * amountPerHour; // The employee's salary is the worked hour mult amount per hour

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);

    }
}
