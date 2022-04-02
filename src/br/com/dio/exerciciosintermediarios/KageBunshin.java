package br.com.dio.exerciciosintermediarios;

import java.util.Scanner;

public class KageBunshin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C;



        for (int i = 0; i < 3; i++){
            C = sc.nextInt();
            System.out.println(C / 2 );
        }

        sc.close();
    }
}
