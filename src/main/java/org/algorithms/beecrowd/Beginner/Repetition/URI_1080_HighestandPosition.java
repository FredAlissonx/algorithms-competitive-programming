package org.algorithms.beecrowd.Beginner.Repetition;
import java.io.IOException;
import java.util.Scanner;
public class URI_1080_HighestandPosition {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int position = 0;
        int highest = 0;

        for(int i = 1; i < 101; i++){
            int n = sc.nextInt();

            // if 'n' is greater than 'highest', so I will put 'highest' with value of 'n'
            if(n > highest){
                highest = n;
                position = i; // to get the position
            }
        }
        System.out.println(highest);
        System.out.println(position);

    }
}
