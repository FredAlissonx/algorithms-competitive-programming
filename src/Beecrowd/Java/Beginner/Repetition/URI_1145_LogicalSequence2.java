package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1145_LogicalSequence2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = 1; i <= n2; i++){
            for (int j = 1; j < n1; j++) {
                if(i != n2){
                    System.out.print(i++ + " ");
                }else{
                    System.out.print(i++);
                }
            }
            System.out.println(i);
        }
    }
}
