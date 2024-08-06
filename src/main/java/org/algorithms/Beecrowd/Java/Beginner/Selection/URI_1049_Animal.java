package org.algorithms.Beecrowd.Beginner.Selection;

import java.io.IOException;
import java.util.Scanner;

public class URI_1049_Animal {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();

        //Switch statement with 'w1'
        //OBS: String is a reference type, so if you want to compare gis value
        // with another String you need to use equals()
        switch (w1){
            case "vertebrado" -> { // in case 'w1' is vertebrado
                if(w2.equals("ave")){
                    if(w3.equals("carnivoro")) // when is a simple if and else you don't need to put brackets
                        System.out.println("aguia");
                    else
                        System.out.println("pomba");
                }
                else{
                    if(w3.equals("onivoro"))
                        System.out.println("homem");
                    else
                        System.out.println("vaca");
                }
            }

            case "invertebrado" -> { // in case 'w1' is invertebrado
                if(w2.equals("inseto"))
                    if(w3.equals("hematofago"))
                        System.out.println("pulga");
                    else{
                        System.out.println("lagarta");
                }
                else{
                    if(w3.equals("hematofago"))
                        System.out.println("sanguessuga");
                    else
                        System.out.println("minhoca");
                }
            }
        }
    }
}
