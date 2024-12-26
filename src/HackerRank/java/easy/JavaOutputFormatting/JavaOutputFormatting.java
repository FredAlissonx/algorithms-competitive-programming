package com.br.hackerrank.java.easy.JavaOutputFormatting;

import java.io.*;

public class JavaOutputFormatting {
    public static void main(String[] args) throws IOException {
        File file = new File("arquivo.txt");
        BufferedReader bf = new BufferedReader(new FileReader(file));
        try {
            FileReader fr = new FileReader(file);
            // Alguma lógica aqui usando FileReader
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        finally {
            bf.close();
        }
    }
}
