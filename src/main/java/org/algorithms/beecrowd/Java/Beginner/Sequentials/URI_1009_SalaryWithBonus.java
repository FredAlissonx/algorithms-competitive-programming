package org.algorithms.beecrowd.Beginner.Sequentials;

import java.io.IOException;
import java.util.Scanner;

public class URI_1009_SalaryWithBonus {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double totalSales = sc.nextDouble();
        double finalSalary = fixedSalary + totalSales * 0.15; // total sales * 15 is equal 15 percent

        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);
    }
}
