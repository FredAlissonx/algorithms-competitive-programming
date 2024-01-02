package org.algorithms.beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1048_SalaryIncrease {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double employeesBaseSalary = sc.nextDouble();
        double newSalary, moneyEarned;
        int percentage;

        //We do a selection to get if the employee's salary is in some condition
        //if employee's salary is greater/equal than 0 AND lower/equal than 400
        if(employeesBaseSalary >= 0 && employeesBaseSalary <= 400.0){
            // set the percentage according the table
            percentage = 15;
            // to get the newSalary we need to get the base salary plus the increase(calculated by percentage in base salary)
            newSalary = employeesBaseSalary + employeesBaseSalary / 100 * percentage;
            moneyEarned = employeesBaseSalary / 100 * percentage;
        }
        else if(employeesBaseSalary <= 800.0){
            percentage = 12;
            newSalary = employeesBaseSalary + employeesBaseSalary / 100 * percentage;
            moneyEarned = employeesBaseSalary / 100 * percentage;
        }
        else if(employeesBaseSalary <= 1200.0){
            percentage = 10;
            newSalary = employeesBaseSalary + employeesBaseSalary / 100 * percentage;
            moneyEarned = employeesBaseSalary / 100 * percentage;
        }
        else if(employeesBaseSalary <= 2000.0){
            percentage = 7;
            newSalary = employeesBaseSalary + employeesBaseSalary / 100 * percentage;
            moneyEarned = employeesBaseSalary / 100 * percentage;
        }
        //if no conditions was true
        else{
            percentage = 4;
            newSalary = employeesBaseSalary + employeesBaseSalary / 100 * percentage;
            moneyEarned = employeesBaseSalary / 100 * percentage;
        }

        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
        System.out.println("Em percentual: " + percentage + " %");
    }
}