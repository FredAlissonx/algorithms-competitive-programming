package com.br.hackerrank.java.easy.JavaStringsIntroduction;

import java.util.*;
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        List<String> strings = new ArrayList(Arrays.asList(A, B));

        Collections.sort(strings);
        System.out.println(A.length() + B.length());

        if(strings.get(0).equals(A)) System.out.println("No");
        else System.out.println("Yes");

        A = A.replace(A.substring(0, 1), A.substring(0, 1).toUpperCase());
        B = B.replace(B.substring(0, 1), B.substring(0, 1).toUpperCase());

        System.out.println(A + " " + B);

        sc.close();
    }
}
