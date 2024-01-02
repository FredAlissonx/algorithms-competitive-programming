package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1150_ExceedingZ {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int z = 0;
        int count = 0;

        // A do while to set a value for 'z' greater than 'x'
        do{
            z = sc.nextInt();
        }while(z <= x);


        // Start the count of consecutive numbers
        for(int i = x; i < z; i += x + 1){
            count += 1;
        }

        System.out.println(count);
    }
}
