package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1132_Multiplesof13 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        //Verify if 'n2' is greater than 'n1'
        if(n1 < n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for(int i = n2; i <= n1; i++){
            if(i % 13 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
