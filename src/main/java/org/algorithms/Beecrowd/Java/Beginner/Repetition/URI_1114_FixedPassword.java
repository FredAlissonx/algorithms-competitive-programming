package org.algorithms.Beecrowd.Beginner.Repetition;

import java.io.IOException;
import java.util.Scanner;

public class URI_1114_FixedPassword {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while(true){
            int number = sc.nextInt();
            if(number == 2002){
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");
            }
        }
    }
}
