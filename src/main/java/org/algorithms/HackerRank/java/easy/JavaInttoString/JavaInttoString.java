package com.br.hackerrank.java.easy.JavaInttoString;

import java.util.Scanner;

public class JavaInttoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String NString = Integer.toString(N);

        if(NString instanceof String)
            System.out.println("Good job");
        else
            System.out.println("Wrong answear");
    }
}
