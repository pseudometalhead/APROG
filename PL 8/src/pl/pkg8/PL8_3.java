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
public class PL8_3 {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int l = 0;
        l = linhaMatriz(l);
        int c = 0;
        c = colunaMatriz(c);
        int[][] m = preencheMatriz(l, c);
        System.out.println("Matriz");
        imprimeMatriz(m, m[0].length);
        int[][] freq = freqMatriz(m, l, c);
        //imprimeMatriz(freq, freq[0].length);
        int nLength = apagaRepVec(freq);
        System.out.println("Frequencia");
        //imprimeMatriz(freq, nLength);
        ordenaMatriz(freq, nLength);
    }

    public static int pedeNumIntPos() {
        //solicita inteiro positivo 
        int N;
        do {

            N = ler.nextInt();
        } while (N < 0);

        return N;
    }

    public static int linhaMatriz(int l) {
        //metodo que pergunta ao utilizador que tamanho pretende que a matriz tenha
        //System.out.println("Insira número de linhas");
        l = pedeNumIntPos();
        return l;
    }

    public static int colunaMatriz(int c) {
        //metodo que pergunta ao utilizador que tamanho pretende que a matriz tenha
        //System.out.println("Insira número de colunas");
        c = pedeNumIntPos();
        return c;
    }

    public static int[][] preencheMatriz(int l, int c) {
        //metodo que preenche matriz de l x c elementos fornecidos em argumento
        int m[][] = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                //System.out.println("Insira elemento da posição " + (i + 1) + " " + (j + 1));
                m[i][j] = ler.nextInt();
            }
        }
        return m;
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

    public static int[][] freqMatriz(int[][] m, int l, int c) {
//metodo que devolve frequencia de elementos de matriz dada em argumento
        int aux;
        int[][] frequencias = new int[2][c * l];
        int k = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                aux = m[i][j];
                frequencias[0][k] = aux;
                frequencias[1][k] = checkRepetidos(aux, m, l, c);
                k++;
            }
        }

        return frequencias;
    }

    public static int checkRepetidos(int aux, int[][] m, int l, int c) {
        int cont = 0;
        boolean teste = false;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (aux == m[i][j]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int apagaRepVec(int[][] v) {
        boolean teste = false;
        int n = v[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (v[0][i] == v[0][j] && i != j) {
                    n--;
                    for (int k = j; k < n; k++) {
                        v[0][k] = v[0][k + 1];
                        v[1][k] = v[1][k + 1];
                    }
                    teste = true;
                }
            }
            if (teste == true) {
                teste = false;
                i--;
            }
        }
        //System.out.println(n);
        return n;
    }

    public static void ordenaMatriz(int[][] m, int n) {//ordena vec num decrescente
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m[1][i] < m[1][j]) {
                    aux = m[0][i];
                    m[0][i] = m[0][j];
                    m[0][j] = aux;
                    aux = m[1][i];
                    m[1][i] = m[1][j];
                    m[1][j] = aux;
                }
            }
        }

        imprimeMatriz(m, n);
    }
}
