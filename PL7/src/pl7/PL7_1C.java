/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL7_1C {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int N = nElem();
        int[] v = lerNums(N);
        double media = calcMediaVec(v, N);
        //System.out.println(media);
        listaSupMedia(v, N, media);
    }

    public static int nElem() {
        int N;
        do {
            System.out.println("Quantos números pretende inserir?");
            N = ler.nextInt();
        } while (N < 0);
        return N;
    }

    public static int[] lerNums(int N) {

        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Insira número");
            v[i] = ler.nextInt();
        }
        return v;
    }

    public static double calcMediaVec(int v[], int N) {
        int soma = 0;
        for (int i = 0; i < N; i++) {
            soma = soma + v[i];
        }
        double media = (double) soma / (double) N;
        return media;
    }

    public static void listaSupMedia(int v[], int N, double media) {
        for (int i = 0; i < N; i++) {
            if (v[i] > media) {
                System.out.println("Ordem de leitura: " + (i + 1));
                System.out.println("Número: " + v[i] +"\n");
            }
        }
    }
}
