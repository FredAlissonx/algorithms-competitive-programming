package com.br.hackerrank.java.easy.JavaLoopsI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i <= 10; i++){
            int mult = N * i;

            System.out.printf("%d x %d = %d\n", N, i, mult);
        }

        bufferedReader.close();
    }
}
