package com.br.hackerrank.java.easy.JavaStdinandStdoutI;

import java.util.Scanner;

public class JavaStdinandStdoutI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        System.out.printf("%d\n%d\n%d", n1, n2, n3);

        sc.close();
    }
}
