package org.algorithms.beecrowd.Beginner.Repetition;

import java.io.IOException;

public class URI_1095_SequenceIJ1 {
    public static void main(String[] args) throws IOException {

        int I = 1, J = 60;

        // We will use Step to do this
        for(int i = J; i >= 0; i -= 5){
            System.out.println("I=" + I + " J=" + i);
            I += 3; // Increment for each -5 in 'J'
        }
    }
}
