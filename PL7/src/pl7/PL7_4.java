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
 
public class PL7_4 {
static Scanner ler = new Scanner(System.in); 
    /**
     * @param ar    gs the command line arguments
     */
    public static void main(String[] args) {
        int[] v=inserirNum();
        int N=v.length;
        v = inverteVec(v, N);
        mostrarLista(v, N);
        int[] rotDireita = rotDireita(v, N);
        //mostrarLista(v, N);
        mostrarLista(rotDireita, N);
    }

    public static int[] inserirNum() {
        int N;
        do {
            
            //System.out.println("Quantos nÃƒÂºmeros pretende inserir?");
            N = ler.nextInt();
        } while (N < 0);
        int v[] = new int[N];
        for (int i = 0; i < N; i++) {
            
            //System.out.println("Insira nÃƒÂºmero!");
            v[i] = ler.nextInt();
        }
        return v;
    }

    public static int[] inverteVec(int[] v1, int n) {
        int[] aux = new int[n];
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            aux[i] = v1[j];
            j--;
        }
        return aux;
    }

    public static void mostrarLista(int[] v1, int n) {
        String aux = ""; //???? INICIALIZAR VARIAVEL

        for (int i = 0; i < n; i++) {

            aux = aux + v1[i] + " ";

        }
        System.out.println(aux);
    }

    public static int[] rotDireita(int[] v1, int n) {
        int[] aux = new int[n];
        aux[0] = v1[n - 1];
        for (int i = 1; i < n; i++) {
            aux[i] = v1[i - 1];
        }
        return aux;
    }
}
