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
public class TESTE3 {

    /**
     * @param args the command line arguments
     */
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int nElem, i, j;
        String pergunta;
        pergunta = "Linhas: ";
        int l = valida(pergunta);
        pergunta = "Colunas: ";
        int c = valida(pergunta);
        int[][] vec = new int[l][c];
        introduzir(vec);
        int[][] freq = new int[l][c];
        intFreq(freq, vec);
        System.out.println();
        int[][] aux = new int[2][(l * c)];
        nElem = auxiliar(aux, freq, vec);
        ordenar(aux, nElem);
        System.out.println("Matriz");
        for (i = 0; i < vec.length; i++) {
            for (j = 0; j < vec[0].length; j++) {
                System.out.printf("%4d", vec[i][j]);
            }
            System.out.println();
        }
        System.out.println("Frequencia");
        for (i = 0; i < aux.length; i++) {
            for (j = 0; j < nElem; j++) {
                System.out.printf("%4d", aux[i][j]);
            }
            System.out.println();
        }
    }

    public static void ordenar(int[][] aux, int nElem) {
        int[] op = new int[2];
        int alt,i;
        do {
            alt = 0;
            for (i = 0; i < nElem; i++) {
                if (aux[1][i] < aux[1][i + 1]) {
                    op[0] = aux[0][i];
                    op[1] = aux[1][i];
                    aux[0][i] = aux[0][i + 1];
                    aux[1][i] = aux[1][i + 1];
                    aux[0][i + 1] = op[0];
                    aux[1][i + 1] = op[1];
                    alt++;
                }
            }
        } while (alt != 0 || i != nElem);
    }

    public static int auxiliar(int[][] aux, int[][] freq, int[][] vec) {
        int nElem = 0, i, j;
        for (i = 0; i < vec.length; i++) {
            for (j = 0; j < vec[0].length; j++) {
                if (naoIgual(vec, i, j)) {
                    aux[0][nElem] = vec[i][j];
                    aux[1][nElem] = freq[i][j];
                    nElem++;
                }
            }
        }
        return nElem;
    }

    public static boolean naoIgual(int[][] vec, int i, int j) {
        int m, n;
        for (n = j - 1; n >= 0; n--) {
            if (vec[i][n] == vec[i][j]) {
                return false;
            }
        }
        for (m = 0; m < i; m++) {
            for (n = 0; n < vec[0].length; n++) {
                if (vec[m][n] == vec[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int frequencia(int[][] vec, int i, int j) {
        int h, g, n = 0;
        for (h = 0; h < vec.length; h++) {
            for (g = 0; g < vec[0].length; g++) {
                if (vec[i][j] == vec[h][g]) {
                    n++;
                }
            }
        }
        return n;
    }

    public static void intFreq(int[][] freq, int[][] vec) {
        int i, j;
        for (i = 0; i < freq.length; i++) {
            for (j = 0; j < freq[0].length; j++) {
                freq[i][j] = frequencia(vec, i, j);
            }
        }
    }

    public static void introduzir(int[][] vec) {
        int i, j;
        for (i = 0; i < vec.length; i++) {
            for (j = 0; j < vec[0].length; j++) {
                vec[i][j] = ler.nextInt();
            }
        }
    }

    public static int valida(String pergunta) {
        int num;
        do {
            num = ler.nextInt();
        } while (num < 1);
        return num;
    }

}