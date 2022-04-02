package br.com.dio.exerciciosJava;

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int hInicial = leitor.nextInt();
        int hFinal = leitor.nextInt();

        if (hInicial > hFinal) {
            System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
        } else if (hFinal > hInicial) {
            System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
