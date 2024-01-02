package com.br.hackerrank.java.easy.JavaStdinandStdoutII;

import java.util.Scanner;

public class JavaStdinandStdoutII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberInteger = sc.nextInt();
        double numberDouble = sc.nextDouble();
        sc.nextLine();
        String outString = sc.nextLine();

        System.out.println("String: " + outString);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + numberInteger);
    }
}
