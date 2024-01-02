package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1113_AscendingandDescendin {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while(true){

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            // verify if 'n1' is equal 'n2', if it is true will break the loop
            if(n1 == n2){
                break;
            }
            // verifying if a number is greater than other and printing the right output
            if(n1 > n2){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
        }
    }
}
