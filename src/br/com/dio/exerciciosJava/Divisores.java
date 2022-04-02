package br.com.dio.exerciciosJava;

import java.io.IOException;
import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        // N é o numero
        // exemplo 6
        // i começa em 1 SEMPRE pq nao da p dividir por 0. dai i++ 1 -- 6/1 = 6 resto 0, i++ 6/2 sobra 0 i++
        // 6/3 sobra 0 i++
        // 6/4 nao sobra 0 entao nao printa i++
        // 6/5 nao sobra 0 tmb nao printa i++
        // 6/6 sobra 0 dai i = n entao fecha loop
        for (int i = 1; i <= N; i++) {
            if (N % i == 0)
                System.out.println(i);
        }
        leitor.close();
    }
}