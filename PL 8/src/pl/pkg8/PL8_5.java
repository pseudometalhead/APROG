/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pkg8;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL8_5 {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira numero de linhas");
        int l = intPos();
        System.out.println("Insira numero de linhas");
        int c = intPos();
        int[][] m = preencheMatriz(l, c);
        imprimeMatriz(m, m[0].length);
        matrizSoma(m);

    }

    public static int intPos() {
        //metodo que pergunta ao utilizador que tamanho pretende que a matriz tenha
        int n;
        do {
            n = ler.nextInt();
        } while (n < 1);

        return n;
    }

    public static int[][] preencheMatriz(int l, int c) {
        //metodo que preenche matriz quadrada de n elementos fornecidos em argumento
        int m[][] = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                //System.out.println("Insira elemento da posição " + (i + 1) + " " + (j + 1));
                m[i][j] = ler.nextInt();
            }
        }
        return m;
    }

    public static void matrizSoma(int[][] m) {
        int[][] somas = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                somas[i][j] = somaElem(m, i, j, m.length, m[0].length);
            }
        }
        imprimeMatriz(somas, somas[0].length);
        maiorMatriz(somas);
    }

    public static int somaElem(int[][] m, int i, int j, int l, int c) {
        int n = 0;
//        for (int k = 0; k < m.length; k++) {
//            if (k != j && ) {
//                n = n + m[i][k];
//            }
//        }
//        for (int h = 0; h < m[0].length; h++) {
//            if (h != i) {
//                n = n + m[h][j];
//            }
//        }
        for (int k = 0; k < m.length; k++) {
            for (int h = 0; h < m[0].length; h++) {
                if (k != i && h != j) {
                    n = n + m[k][h];
                }
            }
        }
        return n;
    }

    public static void imprimeMatriz(int[][] m, int colunas) {
        //metodo que imprime matriz
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < colunas; j++) {
                //aux = aux + m[i][j] + "   ";
                // System.out.print(m[i][j]);     
                System.out.printf("%4d", (m[i][j]));
            }
            System.out.print(aux);
            aux = "";
            System.out.println(" ");
        }
    }

    public static void maiorMatriz(int[][] m) {
        int maior = m[0][0];
        int l = 0;
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    l = i;
                    c = j;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == maior) {
                    {
                        System.out.println("Indíce: " + i + " " + " " + j);
                    }
                }
            }
        }
    }
}
