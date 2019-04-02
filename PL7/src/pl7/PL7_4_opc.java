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
public class PL7_4_opc {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] v = lerNums();
        int N = v.length;
        String aux;
        System.out.println("Quantos deslocamentos pretende efectuar?");
        int D = ler.nextInt();
        String teste;
        do {
            System.out.println("Para que lado?  \n E - Esquerda \n D - Direita");
            ler.nextLine();
            aux = ler.nextLine();
            teste = aux.substring(0,1);
        } while (!"e".equalsIgnoreCase(teste) && !"d".equalsIgnoreCase(teste) );
        mostrarLista(v, N);
        if (teste.equalsIgnoreCase("e")) {
            int[] rotEsquerda = rodaVecEsq(v, N, D);
            mostrarLista(rotEsquerda, N);
        } else {
            int[] rotDireita = rodaVecDir(v, N, D);
            mostrarLista(rotDireita, N);
        }
    }

    public static int[] lerNums() {
        int N;
        do {
            System.out.println("Quantos números vai inserir?");
            N = ler.nextInt();
        } while (N < 0);
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            Scanner ler1 = new Scanner(System.in);
            System.out.println("Insira número");
            v[i] = ler1.nextInt();
        }
        return v;
    }

    public static int[] rodaVecDir(int[] v, int N, int deslocamentos) {
        while (deslocamentos > N) {
            deslocamentos = deslocamentos - N;
        }
        int[] aux = new int[N];
        //aux[N-1] = v[0];
        int j = N - deslocamentos;
        int i = 0;
        if (deslocamentos % N == 0) {
            aux = v;
        } else {
            do {
                aux[i] = v[j];
                j++;
                i++;
            } while (i < deslocamentos);
            j = 0;
            do {
                aux[i] = v[j];
                j++;
                i++;
            } while (i < N);
        }
        return aux;
    }

    public static int[] rodaVecEsq(int[] v, int N, int deslocamentos) {
        while (deslocamentos > N) {
            deslocamentos = deslocamentos - N;
        }
        int[] aux = new int[N];
        //aux[N-1] = v[0];
        int j = deslocamentos;
        int i = 0;
        if (deslocamentos % N == 0) {
            aux = v;
        } else {
            do {
                aux[i] = v[j];
                j++;
                i++;
            } while (i < N - deslocamentos);
            j = 0;
            do {
                aux[i] = v[j];
                j++;
                i++;
            } while (i < N);
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
}
