package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1042_SimpleSort {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 7
        int n2 = sc.nextInt(); // 21
        int n3 = sc.nextInt(); // -14

        // With example: smallest(3), mid(7), greatest(21)
        // variable to storage the sorting numbers
        int s1, s2, s3;

        // if n1 it is the greatest
        if(n1 > n2 && n1 > n3){
            s3 = n1; // the last one printed will be n1(greatest)
            if(n2 > n3){
                // If n2 is greater than n3 so the smallest(n3) and mid(n2)
                s2 = n2;
                s1 = n3;
            }else{
                // If n2 is not greater than n3 so the smallest(n2) and mid(n3)
                s2 = n3;
                s1 = n2;
            }
        }
        // if n1 is not the greatest
        else if(n2 > n1 && n2 > n3){
            s3 = n2;
            if(n1 > n3){
                s2 = n1;
                s1 = n3;
            }else{
                s2 = n3;
                s1 = n1;
            }
        }
        // If n1 and n2 is not the greatest then n3 is
        else{
            s3 = n3;
            if(n2 > n1){
                s2 = n2;
                s1 = n1;
            }else{
                s2 = n1;
                s1 = n2;
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
